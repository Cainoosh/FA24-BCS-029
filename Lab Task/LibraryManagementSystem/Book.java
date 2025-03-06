public class Book{
	private String title;
	private String issn;
	private String edition;
	private Date publicationDate;
	private Person author;

	Book(String title, String issn, String edition, Date publicationDate, Person author){
		this.title = title;
		this.issn = issn;
		this.edition = edition;
		this.publicationDate = publicationDate;
		this.author = author;

	}

	Book(Book other){
		this.title = other.title;
		this.issn = other.issn;
		this.edition = other.edition;
		this.publicationDate = other.publicationDate;
		this.author = other.author;

	}


	public void setTitle(String title){
		this.title = title;
	}
	
	public void setISSN(String issn){
		this.issn = issn;
	}

	public void setEdition(String edition){
		this.edition = edition;
	}

	public void setPublicationDate(Date publicationDate){
		this.publicationDate = publicationDate;
	}

	public void setAuthor(Person author){
		this.author = author;
	}


	public String getTitle(){
		return title;
	}

	public String getISSN(){
		return issn;
	}

	public String getEdition(){
		return edition;
	}

	public Date getPublicationDate(){
		return publicationDate;
	}

	public Person getAuthor(){
		return author;
	}


	public void showBookDetails(){
		System.out.printf("Title: %s", title);
		System.out.printf("ISSN: %s", issn);
		System.out.printf("Publication Date: ", publicationDate);	
		System.out.printf("Author: ", author);	

	}

}