/* Create menu from items variable */
function generateMenu(items) {
    items.forEach(generateItem);
}

function generateItem(item, index, array) {
    var itemsRow
    if (item.category == "pizza") {
        itemsRow = document.getElementById("pizza_items_row");
    } else if (item.category == "beverage") {
        itemsRow = document.getElementById("beverage_items_row");
    } else if (item.category == "salad") {
        itemsRow = document.getElementById("salad_items_row");
    } else if (item.category == "sandwich") {
              itemsRow = document.getElementById("sandwich_items_row");
    } else if (item.category == "dessert") {
                   itemsRow = document.getElementById("dessert_items_row");
    }

    var i
    var imagediv =  createDivWithClass("PT_image");
    imagediv.appendChild(createImage(item.imageName));
    var itemBox = createDivWithClass("P_itmesbox")
    itemBox.appendChild(imagediv);

    var descrdiv = createDivWithClass("PT_dscr");
    var descheading = createH3WithClass("PT_title");
    descheading.appendChild(createParagraph(item.name));
    descrdiv.appendChild(descheading);
    descrdiv.appendChild(createParagraphWithClass(item.description, 'PT_dtls' ));

    if (item.sizes == "threeSizes") {
        var optiondiv = createDivWithClass("PT_optn");
        var radioUnOrderedList = createUlWithClass("PT-radio");
        var radioListItem = createRadioItem('radio-group-1', 'radio-1', 'radio-1', 'Medium', "checked")
        radioUnOrderedList.appendChild(radioListItem);

        radioListItem =  createRadioItem('radio-group-1', 'radio-2', 'radio-2', 'Large', "")
        radioUnOrderedList.appendChild(radioListItem);

        radioListItem =  createRadioItem('radio-group-1', 'radio-3', 'radio-3', 'Extra Large', "")
        radioUnOrderedList.appendChild(radioListItem);

        optiondiv.appendChild(radioUnOrderedList);
        descrdiv.appendChild(optiondiv);
    }
    var priceDiv = createDivWithClass("price_block");
    var priceItemDiv = createDivWithClass('price');
    priceItemDiv.innerText = '$'+ item.price;

    priceDiv.appendChild(priceItemDiv);
    priceDiv.appendChild(createCartButton('#'));
    descrdiv.appendChild(priceDiv);
    itemBox.appendChild(descrdiv);

    var itemDiv = createDivWithClass("col-lg-4 col-md-6 col-sm-6 col-xs-12");
    itemDiv.appendChild(itemBox);
    itemsRow.appendChild(itemDiv);
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

function createRadioItem(radioGroup, id, forValue, text, thisIsDefault) {
    var radioListItem = document.createElement("li");
    var radioInput = document.createElement("input");
    radioInput.setAttribute('type', 'radio');
    radioInput.setAttribute('name',radioGroup);
    radioInput.setAttribute('id', id);
    if (thisIsDefault == "checked") {
        radioInput.setAttribute('checked', 'checked');
    }
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
function createCartSpan(spanClass, text) {
    var span = document.createElement('span');
    span.setAttribute('class', spanClass);
    span.innerText = text;
    return span;
}

function reportSize(sizeSelector) {
    if (sizeSelector != "mediumSize" ) {
        return "Medium";
    } else if (sizeSelector == "largeSize") {
        return "Large";
    } else if (sizeSelector == "extraLargeSize") {
        return "Extra Large";
    } else {
        return "";
    }
}

function generateYourOrder(cart) {
    cart.items.forEach(generateOrderItem);
    generateYourOrderPrice(cart.totalCost);
}


function generateYourOrderPrice(totalPrice) {
    var priceDiv = document.getElementById("your_order_total_div");
    var totalPriceSpan = createCartSpan("O_price", totalPrice);
    priceDiv.appendChild(totalPriceSpan);
}

function generateOrderItem(item, index, array) {
    var itemsList = document.getElementById("your_order_items_list");
    var listItem = document.createElement('li');
    var orderNum = createDivWithClass("Order_number");
    var orderNames = createDivWithClass("Order_names");
    var oName = createCartSpan("O_name", item.numberOrdered + "x " + item.orderItem.name);
    orderNames.appendChild(oName);
    if (item.size != "oneSize") {
        var oType = createCartSpan("O_type", reportSize(item.size));
        orderNames.appendChild(oType);
    }
    orderNum.appendChild(orderNames);
    var priceDiv = createDivWithClass("Order_price");
    var priceSpan = createCartSpan("O_price", item.totalPrice);
    priceDiv.appendChild(priceSpan);
    orderNum.appendChild(priceDiv);
    listItem.appendChild(orderNum);
    itemsList.appendChild(listItem);
}