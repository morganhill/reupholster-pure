using "geb"

scenario "index page", {

    when "we open the index page", {
        go "http://localhost:5984/reupholster-pure/_design/app/index.html"
    }
    then "jquery runs, and changes text to trailhead", {

        $('div.huge').text().shouldBe "Contacts"
    }
}


scenario "print all documents", {
	when "We are on the default page", {
		go "http://localhost:5984/reupholster-pure/_design/app/index.html"
	}
	then "there is list of all document ids", {
		$('li.contact').size().shouldBeGreaterThan 0
	}
}