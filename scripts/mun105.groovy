
String imgUrnBase = "urn:cite:bsb:muncg105img.MunCG105_img"
String ms = "Bayerische Staatsbibliothek, Codex Graecus 105"

String lic = "Image from the Bayerische Staatsbibliothek, licensed under the Creative Commons 'Namensnennung - Keine kommerzielle Nutzung - Weitergabe unter gleichen Bedingungen 3.0 Deutschland' license (CC-BY-NC-SA)"


Integer folio = 0
Integer img = 9
Integer evenMod = img % 2

Integer last = 81
String urn = ""
  
println "Image,Caption,Rights"
while (img <= last ) {
  urn = "${imgUrnBase}${img}"
  String side
  if (img % 2 == evenMod) {
    side = "recto"
    folio++
  } else {
    side = "verso"
  }
  print urn + ',"' + "${ms}, folio ${folio}, ${side}."+ '","'
  println "${lic}" + '"'
  img++
}

// 82 and 83 and dupes!!  Omit
urn = "${imgUrnBase}84"
folio = 37
println urn + ',"' + "${ms}, folio ${folio} verso."+ '","' + "${lic}" + '"' 

img = 85
last =  233 //714

while (img <= last ) {
  urn = "${imgUrnBase}${img}"
  String side
  if (img % 2 == evenMod) {
    side = "recto"
    folio++
  } else {
    side = "verso"
  }
  print urn + ',"' + "${ms}, folio ${folio}, ${side}."+ '","'
  println "${lic}" + '"'
  img++
}

//234 and 235 are dupes!
img = 236
last =  361 //714
while (img <= last ) {
  urn = "${imgUrnBase}${img}"
  String side
  if (img % 2 == evenMod) {
    side = "recto"
    folio++
  } else {
    side = "verso"
  }
  print urn + ',"' + "${ms}, folio ${folio}, ${side}."+ '","'
  println "${lic}" + '"'
  img++
}


// 362 and 363 are dupes
img = 364
last =  436 //714
while (img <= last ) {
  urn = "${imgUrnBase}${img}"
  String side
  if (img % 2 == evenMod) {
    side = "recto"
    folio++
  } else {
    side = "verso"
  }
  print urn + ',"' + "${ms}, folio ${folio}, ${side}."+ '","'
  println "${lic}" + '"'
  img++
}

urn = "${imgUrnBase}437"
println urn + ',"' + "${ms}, folio 212a, recto."+ '","' + "${lic}" + '"'
urn = "${imgUrnBase}438"
println urn + ',"' + "${ms}, folio 212a, verso."+ '","' + "${lic}" + '"'


urn = "${imgUrnBase}439"
println urn + ',"' + "${ms}, folio 212b, recto."+ '","' + "${lic}" + '"'
urn = "${imgUrnBase}440"
println urn + ',"' + "${ms}, folio 212b, verso."+ '","' + "${lic}" + '"'


folio =  212
img = 441
last =  460 //714
while (img <= last ) {
  urn = "${imgUrnBase}${img}"
  String side
  if (img % 2 == evenMod) {
    side = "recto"
    folio++
  } else {
    side = "verso"
  }
  print urn + ',"' + "${ms}, folio ${folio}, ${side}."+ '","'
  println "${lic}" + '"'
  img++
}



urn = "${imgUrnBase}461"
println urn + ',"' + "${ms}, folio 222a, recto."+ '","' + "${lic}" + '"'
urn = "${imgUrnBase}462"
println urn + ',"' + "${ms}, folio 222a, verso."+ '","' + "${lic}" + '"'


img = 463
folio = 222
last = 519 //714
while (img <= last ) {
  urn = "${imgUrnBase}${img}"
  String side
  if (img % 2 == evenMod) {
    side = "recto"
    folio++
  } else {
    side = "verso"
  }
  print urn + ',"' + "${ms}, folio ${folio}, ${side}."+ '","'
  println "${lic}" + '"'
  img++
}


// 520 and 521 are dupes

img = 522
//folio = 222
last = 528
while (img <= last ) {
  urn = "${imgUrnBase}${img}"
  String side
  if (img % 2 == evenMod) {
    side = "recto"
    folio++
  } else {
    side = "verso"
  }
  print urn + ',"' + "${ms}, folio ${folio}, ${side}."+ '","'
  println "${lic}" + '"'
  img++
}



urn = "${imgUrnBase}529"
println urn + ',"' + "${ms}, folio 255a, recto."+ '","' + "${lic}" + '"'
urn = "${imgUrnBase}530"
println urn + ',"' + "${ms}, folio 255a, verso."+ '","' + "${lic}" + '"'

urn = "${imgUrnBase}531"
println urn + ',"' + "${ms}, folio 255b, recto."+ '","' + "${lic}" + '"'
urn = "${imgUrnBase}532"
println urn + ',"' + "${ms}, folio 255b, verso."+ '","' + "${lic}" + '"'


img = 533
folio = 255
last = 714

while (img <= last ) {
  urn = "${imgUrnBase}${img}"
  String side
  if (img % 2 == evenMod) {
    side = "recto"
    folio++
  } else {
    side = "verso"
  }
  print urn + ',"' + "${ms}, folio ${folio}, ${side}."+ '","'
  println "${lic}" + '"'
  img++
}
