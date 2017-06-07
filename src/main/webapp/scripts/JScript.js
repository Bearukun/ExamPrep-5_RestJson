var btn = document.getElementById("btn");
var tbody = document.getElementById("bodyT");

var people;
var fetchedPerson;

//Function to fetch people from the database through the REST Api.
function fetchPeople() {

    var url = "http://localhost:8084/ExamPrep-5_RestJson/api/addresses/100/lname,fname,street,city";
    var conf = {method: 'get'};
    var promise = fetch(url, conf);

    promise.then(function (response) {

        return response.text();

    }).then(function (text) {


        document.getElementById("bodyT").innerHTML = listMaker(text);

    });


}

//Function to generate a formated list to pupulate the table on the website
function listMaker(arr) {

    var parsed = JSON.parse(arr);
    var lis = parsed.map(function (people) {

        return  "<tr>" +
                "<td>" + people.fName + "</td>" +
                "<td>" + people.lName + "</td>" +
                "<td>" + people.street + "</td>" +
                "<td>" + people.city + "</td>" +
                "</tr>";

    });
    return lis.join("");
}
;

fetchPeople();




