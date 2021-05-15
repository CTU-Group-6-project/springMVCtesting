/* Create menu from items variable */
function generateMenu(item1desc, item1name, item1price) {
    var item1desc = item1desc;
    var imagediv = document.createElement("div");
    imagediv.setAttribute('class', "PT_image");
    var image = document.createElement("img");
    image.setAttribute('class', "absoImg");
    image.setAttribute('src', "images/Bacon-Cheeseburger.png");
    image.setAttribute('alt',"");
    imagediv.appendChild(image);
    var item1div = document.getElementById("itembox1");
    item1div.appendChild(imagediv);

    var descrdiv = document.createElement("div");
    descrdiv.setAttribute('class', "PT_dscr");
    var descheading = document.createElement("h3");
    descheading.setAttribute('class', "PT_title");
    var headingP = document.createElement("p");
    headingP.innerText = item1name;
    descheading.appendChild(headingP);
    descrdiv.appendChild(descheading);
    var descP = document.createElement('p');
    descP.setAttribute('class', 'PT_dtls');
    descP.innerText = item1desc ;
    descrdiv.appendChild(descP);

    var optiondiv = document.createElement("div");
    optiondiv.setAttribute('class', "PT_optn");
    var radioUnOrderedList = document.createElement("ul");
    radioUnOrderedList.setAttribute('class', "PT-radio");
    var radioListItem = document.createElement("li");
    var radioInput = document.createElement("input");
    radioInput.setAttribute('type', 'radio');
    radioInput.setAttribute('name', 'radio-group-1');
    radioInput.setAttribute('id', 'radio-1');
    radioInput.setAttribute('checked', 'checked');
    var radioInputLabel = document.createElement('label');
    radioInputLabel.setAttribute('for', 'radio-1');
    radioInputLabel.innerText = 'Medium';
    radioListItem.appendChild(radioInput);
    radioListItem.appendChild(radioInputLabel);
    radioUnOrderedList.appendChild(radioListItem);

    radioListItem = document.createElement("li");
    radioInput = document.createElement("input");
    radioInput.setAttribute('type', 'radio');
    radioInput.setAttribute('name', 'radio-group-1');
    radioInput.setAttribute('id', 'radio-2');
    radioInput.setAttribute('checked', 'checked');
    radioInputLabel = document.createElement('label');
    radioInputLabel.setAttribute('for', 'radio-2');
    radioInputLabel.innerText = 'Large';
    radioListItem.appendChild(radioInput);
    radioListItem.appendChild(radioInputLabel);
    radioUnOrderedList.appendChild(radioListItem);

    radioListItem = document.createElement("li");
    radioInput = document.createElement("input");
    radioInput.setAttribute('type', 'radio');
    radioInput.setAttribute('name', 'radio-group-1');
    radioInput.setAttribute('id', 'radio-3');
    radioInput.setAttribute('checked', 'checked');
    radioInputLabel = document.createElement('label');
    radioInputLabel.setAttribute('for', 'radio-3');
    radioInputLabel.innerText = 'Extra Large';
    radioListItem.appendChild(radioInput);
    radioListItem.appendChild(radioInputLabel);
    radioUnOrderedList.appendChild(radioListItem);
    optiondiv.appendChild(radioUnOrderedList);
    descrdiv.appendChild(optiondiv);

    var priceDiv = document.createElement("div");
    priceDiv.setAttribute('class', "price_block");
    var priceItemDiv = document.createElement("div");
    priceItemDiv.setAttribute('class', 'price');
    priceItemDiv.innerText = '$'+ item1price;
    var addToCartButton = document.createElement('a');
    addToCartButton.setAttribute('href', '#');
    addToCartButton.setAttribute('class', 'card_btn');
    addToCartButton.innerText = 'Add to cart';
    priceDiv.appendChild(priceItemDiv);
    priceDiv.appendChild(addToCartButton);
    descrdiv.appendChild(priceDiv);
    item1div.appendChild(descrdiv);
}
