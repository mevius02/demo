// ■フォーム値クリア
function clearFormValue(formIdNm){
	for(var i = 0; i < document.forms[formIdNm].elements.length; ++i){
		clearElementValue(document.forms[formIdNm].elements[i]);
	}
}
// ■要素値クリア
function clearElementValue(element){
	switch(element.type){
		case "date":
		case "email":
		case "month":
		case "number":
		case "password":
		case "tel":
		case "text":
		case "textarea":
		case "time":
			element.value = "";
			return;
		case "checkbox":
		case "radio":
			element.checked = false;
			return;
		case "select-multiple":
		case "select-one":
			element.selectedIndex = 0;
			return;
		default:
	}
}
