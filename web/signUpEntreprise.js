/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var slideIndex = 1;
showSlides(slideIndex);

function plusSlides(n) {
  showSlides(slideIndex += n);
}

function showSlides(n) {
  var i;
  var slides = document.getElementsByClassName("step");
  if (n == slides.length) {document.getElementsByClassName("p")[0].style.display = "none";
                            document.getElementsByClassName("n")[0].style.display = "none";}
  if (n == 1) {document.getElementsByClassName("p")[0].style.display = "none";}
  if (n == 2) {document.getElementsByClassName("p")[0].style.display = "inline";}
  for (i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";
  }
  slides[n-1].style.display = "flex";
}

