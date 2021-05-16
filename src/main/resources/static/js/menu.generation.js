/* Create menu from items variable */
function generateMenu(items) {
    items.forEach(generateItem);
}

function generateItem(item, index, array) {
    var pizzaItemsRow = document.getElementById("pizza_items_row");
    var imagediv =  createDivWithClass("PT_image");
    imagediv.appendChild(createImage(item.imageName));
    var itemBox = createDivWithClass("P_itmesbox")
    itemBox.appendChild(imagediv);

    var descrdiv = createDivWithClass("PT_dscr");
    var descheading = createH3WithClass("PT_title");
    descheading.appendChild(createParagraph(item.name));
    descrdiv.appendChild(descheading);
    descrdiv.appendChild(createParagraphWithClass(item.description, 'PT_dtls' ));

    var optiondiv = createDivWithClass("PT_optn");
    var radioUnOrderedList = createUlWithClass("PT-radio");
    var radioListItem = createRadioItem('radio-group-1', 'radio-1', 'radio-1', 'Medium')
    radioUnOrderedList.appendChild(radioListItem);

    radioListItem =  createRadioItem('radio-group-1', 'radio-2', 'radio-2', 'Large')
    radioUnOrderedList.appendChild(radioListItem);

    radioListItem =  createRadioItem('radio-group-1', 'radio-3', 'radio-3', 'Extra Large')
    radioUnOrderedList.appendChild(radioListItem);

    optiondiv.appendChild(radioUnOrderedList);
    descrdiv.appendChild(optiondiv);

    var priceDiv = createDivWithClass("price_block");
    var priceItemDiv = createDivWithClass('price');
    priceItemDiv.innerText = '$'+ item.price;

    priceDiv.appendChild(priceItemDiv);
    priceDiv.appendChild(createCartButton('#'));
    descrdiv.appendChild(priceDiv);
    itemBox.appendChild(descrdiv);

    var itemDiv = createDivWithClass("col-lg-4 col-md-6 col-sm-6 col-xs-12");
    itemDiv.appendChild(itemBox);
    pizzaItemsRow.appendChild(itemDiv);
}

function createElementWithClass(elementType, elementClass) {
    var divItem = document.createElement(elementType);
    divItem.setAttribute('class', elementClass);
    return divItem;
}

function createDivWithClass(divClass) {
    return createElementWithClass("div", divClass);
}

function createParagraph(paragraphContent) {
    var paragraphItem = document.createElement("p");
    paragraphItem.innerText = paragraphContent;
    return paragraphItem;
}

function createParagraphWithClass(paragraphContent, paragraphType) {
    paragraphItem = createParagraph(paragraphContent);
    paragraphItem.setAttribute('class', paragraphType);
    return paragraphItem;
}

function createImage(imagePath) {
    var image = document.createElement("img");
    image.setAttribute('class', "absoImg");
    image.setAttribute('src', imagePath);
    image.setAttribute('alt',"");
    return image;
}

function createUlWithClass(ulClass) {
    return createElementWithClass("ul", ulClass);
}

function createH3WithClass(h3Class) {
    return createElementWithClass("h3", h3Class);
}

function createRadioItem(radioGroup, id, forValue, text) {
    var radioListItem = document.createElement("li");
    var radioInput = document.createElement("input");
    radioInput.setAttribute('type', 'radio');
    radioInput.setAttribute('name',radioGroup);
    radioInput.setAttribute('id', id);
    radioInput.setAttribute('checked', 'checked');
    var radioInputLabel = document.createElement('label');
    radioInputLabel.setAttribute('for', forValue);
    radioInputLabel.innerText = text;
    radioListItem.appendChild(radioInput);
    radioListItem.appendChild(radioInputLabel);
    return radioListItem;
}

function createCartButton(href) {
var cartButton = document.createElement('a');
    cartButton.setAttribute('href', href);
    cartButton.setAttribute('class', 'card_btn');
    cartButton.innerText = 'Add to cart';
    return cartButton;
}