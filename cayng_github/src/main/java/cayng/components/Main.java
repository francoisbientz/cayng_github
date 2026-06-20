package cayng.components;

import java.util.List;

import org.apache.cayenne.ObjectContext;
import org.apache.cayenne.query.ObjectSelect;

import ng.appserver.NGActionResults;
import ng.appserver.NGContext;
import ng.appserver.templating.NGComponent;

import cayng.DB;
import cayng.data.Person;

public class Main extends NGComponent {
	public String newPersonName;
	
	public Person person;

	public Main( NGContext context ) {
		super( context );
	}
	
	public NGActionResults createPerson() {
		ObjectContext oc = DB.runtime().newContext();
		
		Person newPerson = oc.newObject(Person.class);
		newPerson.setNom(newPersonName);
		
		oc.commitChanges();
		
		return null;
	}
	public List<Person> people(){
		return ObjectSelect
				.query( Person.class)
				.orderBy(Person.NOM.asc())
				.select( DB.runtime().newContext() );
	}
}
