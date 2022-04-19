var EasyAutocomplete=function(t){return t.Configuration=function(t){function e(){if("xml"===t.dataType&&(t.getValue||(t.getValue=function(t){return $(t).text()}),t.list||(t.list={}),t.list.sort||(t.list.sort={}),t.list.sort.method=function(e,n){return e=t.getValue(e),n=t.getValue(n),n>e?-1:e>n?1:0},t.list.match||(t.list.match={}),t.list.match.method=function(e,n){return e=t.getValue(e),n=t.getValue(n),e===n?!0:!1}),void 0!==t.categories&&t.categories instanceof Array){for(var e=[],n=0,i=t.categories.length;i>n;n+=1){var o=t.categories[n];for(var a in s.categories[0])void 0===o[a]&&(o[a]=s.categories[0][a]);e.push(o)}t.categories=e}}function n(){function e(t,n){var i=t||{};for(var o in t)void 0!==n[o]&&null!==n[o]&&("object"!=typeof n[o]||n[o]instanceof Array?i[o]=n[o]:e(t[o],n[o]));return void 0!==n.data&&null!==n.data&&"object"==typeof n.data&&(i.data=n.data),i}s=e(s,t)}function i(){if("list-required"!==s.url&&"function"!=typeof s.url){var e=s.url;s.url=function(){return e}}if(void 0!==s.ajaxSettings.url&&"function"!=typeof s.ajaxSettings.url){var e=s.ajaxSettings.url;s.ajaxSettings.url=function(){return e}}if("string"==typeof s.listLocation){var n=s.listLocation;"XML"===s.dataType.toUpperCase()?s.listLocation=function(t){return $(t).find(n)}:s.listLocation=function(t){return t[n]}}if("string"==typeof s.getValue){var i=s.getValue;s.getValue=function(t){return t[i]}}void 0!==t.categories&&(s.categoriesAssigned=!0)}function o(){void 0!==t.ajaxSettings&&"object"==typeof t.ajaxSettings?s.ajaxSettings=t.ajaxSettings:s.ajaxSettings={}}function a(t){return void 0!==s[t]&&null!==s[t]?!0:!1}function r(t,e){function n(e,o){for(var a in o)void 0===e[a]&&t.log("Property '"+a+"' does not exist in EasyAutocomplete options API."),"object"!=typeof e[a]||i(a)||n(e[a],o[a])}function i(t){var e=["ajaxSettings","template"];return Array.prototype.contains=function(t){for(var e=this.length;e--;)if(this[e]===t)return!0;return!1},e.contains(t)}n(s,e)}var s={data:"list-required",url:"list-required",dataType:"json",listLocation:function(t){return t},xmlElementName:"",getValue:function(t){return t},autocompleteOff:!0,placeholder:!1,ajaxCallback:function(){},matchResponseProperty:!1,list:{sort:{enabled:!1,method:function(t,e){return t=s.getValue(t),e=s.getValue(e),e>t?-1:t>e?1:0}},maxNumberOfElements:6,hideOnEmptyPhrase:!0,match:{enabled:!1,caseSensitive:!1,method:function(t,e){return t=s.getValue(t),e=s.getValue(e),t===e?!0:!1}},showAnimation:{type:"normal",time:400,callback:function(){}},hideAnimation:{type:"normal",time:400,callback:function(){}},onClickEvent:function(){},onSelectItemEvent:function(){},onLoadEvent:function(){},onChooseEvent:function(){},onKeyEnterEvent:function(){},onMouseOverEvent:function(){},onMouseOutEvent:function(){},onShowListEvent:function(){},onHideListEvent:function(){}},highlightPhrase:!0,theme:"",cssClasses:"",minCharNumber:0,requestDelay:0,adjustWidth:!0,ajaxSettings:{},preparePostData:function(t,e){return t},loggerEnabled:!0,template:"",categoriesAssigned:!1,categories:[{maxNumberOfElements:4}]};this.get=function(t){return s[t]},this.equals=function(t,e){return a(t)&&s[t]===e?!0:!1},this.checkDataUrlProperties=function(){return"list-required"===s.url&&"list-required"===s.data?!1:!0},this.checkRequiredProperties=function(){for(var t in s)if("required"===s[t])return logger.error("Option "+t+" must be defined"),!1;return!0},this.printPropertiesThatDoesntExist=function(t,e){r(t,e)},e(),n(),s.loggerEnabled===!0&&r(console,t),o(),i()},t}(EasyAutocomplete||{}),EasyAutocomplete=function(t){return t.Logger=function(){this.error=function(t){console.log("ERROR: "+t)},this.warning=function(t){console.log("WARNING: "+t)}},t}(EasyAutocomplete||{}),EasyAutocomplete=function(t){return t.Constans=function(){var t={CONTAINER_CLASS:"easy-autocomplete-container",CONTAINER_ID:"eac-container-",WRAPPER_CSS_CLASS:"easy-autocomplete"};this.getValue=function(e){return t[e]}},t}(EasyAutocomplete||{}),EasyAutocomplete=function(t){return t.ListBuilderService=function(t,e){function n(e,n){function i(){var i,o={};return void 0!==e.xmlElementName&&(o.xmlElementName=e.xmlElementName),void 0!==e.listLocation?i=e.listLocation:void 0!==t.get("listLocation")&&(i=t.get("listLocation")),void 0!==i?"string"==typeof i?o.data=$(n).find(i):"function"==typeof i&&(o.data=i(n)):o.data=n,o}function o(){var t={};return void 0!==e.listLocation?"string"==typeof e.listLocation?t.data=n[e.listLocation]:"function"==typeof e.listLocation&&(t.data=e.listLocation(n)):t.data=n,t}var a={};if(a="XML"===t.get("dataType").toUpperCase()?i():o(),void 0!==e.header&&(a.header=e.header),void 0!==e.maxNumberOfElements&&(a.maxNumberOfElements=e.maxNumberOfElements),void 0!==t.get("list").maxNumberOfElements&&(a.maxListSize=t.get("list").maxNumberOfElements),void 0!==e.getValue)if("string"==typeof e.getValue){var r=e.getValue;a.getValue=function(t){return t[r]}}else"function"==typeof e.getValue&&(a.getValue=e.getValue);else a.getValue=t.get("getValue");return a}function i(e){var n=[];return void 0===e.xmlElementName&&(e.xmlElementName=t.get("xmlElementName")),$(e.data).find(e.xmlElementName).each(function(){n.push(this)}),n}this.init=function(e){var n=[],i={};return i.data=t.get("listLocation")(e),i.getValue=t.get("getValue"),i.maxListSize=t.get("list").maxNumberOfElements,n.push(i),n},this.updateCategories=function(e,i){if(t.get("categoriesAssigned")){e=[];for(var o=0;o<t.get("categories").length;o+=1){var a=n(t.get("categories")[o],i);e.push(a)}}return e},this.convertXml=function(e){if("XML"===t.get("dataType").toUpperCase())for(var n=0;n<e.length;n+=1)e[n].data=i(e[n]);return e},this.processData=function(n,i){for(var o=0,a=n.length;a>o;o+=1)n[o].data=e(t,n[o],i);return n},this.checkIfDataExists=function(t){for(var e=0,n=t.length;n>e;e+=1)if(void 0!==t[e].data&&t[e].data instanceof Array&&t[e].data.length>0)return!0;return!1}},t}(EasyAutocomplete||{}),EasyAutocomplete=function(t){return t.proccess=function(t,e,n){function i(e,n){var i=[],o="";if(t.get("list").match.enabled)for(var a=0,r=e.length;r>a;a+=1)o=t.get("getValue")(e[a]),t.get("list").match.caseSensitive||("string"==typeof o&&(o=o.toLowerCase()),n=n.toLowerCase()),o.search(n)>-1&&i.push(e[a]);else i=e;return i}function o(t){return void 0!==e.maxNumberOfElements&&t.length>e.maxNumberOfElements&&(t=t.slice(0,e.maxNumberOfElements)),t}function a(e){return t.get("list").sort.enabled&&e.sort(t.get("list").sort.method),e}var r=e.data,s=n;return r=i(r,s),r=o(r),r=a(r)},t}(EasyAutocomplete||{}),EasyAutocomplete=function(t){return t.Template=function(t){var e={basic:{type:"basic",method:function(t){return t}},description:{type:"description",fields:{description:"description"},method:function(t){return t+" - description"},cssClass:"eac-description"},iconLeft:{type:"iconLeft",fields:{icon:""},method:function(t){return t},cssClass:"eac-icon-left"},iconRight:{type:"iconRight",fields:{iconSrc:""},method:function(t){return t},cssClass:"eac-icon-right"},links:{type:"links",fields:{link:""},method:function(t){return t}},custom:{type:"custom",method:function(){}}},n=function(t){var n=t.fields;if("description"===t.type){var i=e.description.method;return"string"==typeof n.description?i=function(t,e){return t+" - <span>"+e[n.description]+"</span>"}:"function"==typeof n.description&&(i=function(t,e){return t+" - <span>"+n.description(e)+"</span>"}),i}if("iconRight"===t.type){var i="";return"string"==typeof n.iconSrc?i=function(t,e){return t+"<img class='eac-icon' src='"+e[n.iconSrc]+"' />"}:"function"==typeof n.iconSrc&&(i=function(t,e){return t+"<img class='eac-icon' src='"+n.iconSrc(e)+"' />"}),i}if("iconLeft"===t.type){var i="";return"string"==typeof n.iconSrc?i=function(t,e){return"<img class='eac-icon' src='"+e[n.iconSrc]+"' />"+t}:"function"==typeof n.iconSrc&&(i=function(t,e){return"<img class='eac-icon' src='"+n.iconSrc(e)+"' />"+t}),i}if("links"===t.type){var i="";return"string"==typeof n.link?i=function(t,e){return"<a href='"+e[n.link]+"' >"+t+"</a>"}:"function"==typeof n.link&&(i=function(t,e){return"<a href='"+n.link(e)+"' >"+t+"</a>"}),i}return"custom"===t.type?t.method:e.basic.method},i=function(t){return t&&t.type&&t.type&&e[t.type]?n(t):e.basic.method},o=function(t){var n=function(){return""};return t&&t.type&&t.type&&e[t.type]?function(){var n=e[t.type].cssClass;return function(){return n}}():n};this.getTemplateClass=o(t),this.build=i(t)},t}(EasyAutocomplete||{}),EasyAutocomplete=function(t){return t.main=function(e,n){function i(){return 0===A.length?void h.error("Input field doesn't exist."):p.checkDataUrlProperties()?p.checkRequiredProperties()?(o(),void r()):void h.error("Will not work without mentioned properties."):void h.error("One of options variables 'data' or 'url' must be defined.")}function o(){function t(){var t=$("<div>"),n=m.getValue("WRAPPER_CSS_CLASS");p.get("theme")&&""!==p.get("theme")&&(n+=" eac-"+p.get("theme")),p.get("cssClasses")&&""!==p.get("cssClasses")&&(n+=" "+p.get("cssClasses")),""!==v.getTemplateClass()&&(n+=" "+v.getTemplateClass()),t.addClass(n),A.wrap(t),p.get("adjustWidth")===!0&&e()}function e(){var t=A.outerWidth();A.parent().css("width",t)}function n(){A.unwrap()}function i(){var t=$("<div>").addClass(m.getValue("CONTAINER_CLASS"));t.attr("id",a()).prepend($("<ul>")),function(){t.on("show",function(){switch(p.get("list").showAnimation.type){case"slide":var e=p.get("list").showAnimation.time,n=p.get("list").showAnimation.callback;t.find("ul").slideDown(e,n);break;case"fade":var e=p.get("list").showAnimation.time,n=p.get("list").showAnimation.callback;t.find("ul").fadeIn(e),n;break;default:t.find("ul").show()}p.get("list").onShowListEvent()}).on("hide",function(){switch(p.get("list").hideAnimation.type){case"slide":var e=p.get("list").hideAnimation.time,n=p.get("list").hideAnimation.callback;t.find("ul").slideUp(e,n);break;case"fade":var e=p.get("list").hideAnimation.time,n=p.get("list").hideAnimation.callback;t.find("ul").fadeOut(e,n);break;default:t.find("ul").hide()}p.get("list").onHideListEvent()}).on("selectElement",function(){t.find("ul li").removeClass("selected"),t.find("ul li").eq(b).addClass("selected"),p.get("list").onSelectItemEvent()}).on("loadElements",function(e,n,i){var o="",a=t.find("ul");a.empty().detach(),S=[];for(var s=0,u=0,l=n.length;l>u;u+=1){var f=n[u].data;if(0!==f.length){void 0!==n[u].header&&n[u].header.length>0&&a.append("<div class='eac-category' >"+n[u].header+"</div>");for(var d=0,g=f.length;g>d&&s<n[u].maxListSize;d+=1)o=$("<li><div class='eac-item'></div></li>"),function(){var t=d,e=s,a=n[u].getValue(f[t]);o.find(" > div").on("click",function(){A.val(a).trigger("change"),b=e,c(e),p.get("list").onClickEvent(),p.get("list").onChooseEvent()}).mouseover(function(){b=e,c(e),p.get("list").onMouseOverEvent()}).mouseout(function(){p.get("list").onMouseOutEvent()}).html(v.build(r(a,i),f[t]))}(),a.append(o),S.push(f[d]),s+=1}}t.append(a),p.get("list").onLoadEvent()})}(),A.after(t)}function o(){A.next("."+m.getValue("CONTAINER_CLASS")).remove()}function r(t,e){return p.get("highlightPhrase")&&""!==e?u(t,e):t}function s(t){return t.replace(/[\-\[\]\/\{\}\(\)\*\+\?\.\\\^\$\|]/g,"\\$&")}function u(t,e){var n=s(e);return(t+"").replace(new RegExp("("+n+")","gi"),"<b>$1</b>")}A.parent().hasClass(m.getValue("WRAPPER_CSS_CLASS"))&&(o(),n()),t(),i(),C=$("#"+a()),p.get("placeholder")&&A.attr("placeholder",p.get("placeholder"))}function a(){var t=A.attr("id");if(void 0===t||null===t){var e="";do e=g.shortcut+"-"+Math.floor(1e4*Math.random());while(0!==$("#"+e).length);t=m.getValue("CONTAINER_ID")+e,A.attr("id",e)}else t=m.getValue("CONTAINER_ID")+t;return t}function r(){function t(){E("autocompleteOff",!0)&&r(),e(),n(),i(),o(),a()}function e(){A.off("keyup").keyup(function(t){function e(t){function e(){var t={},e=p.get("ajaxSettings")||{};for(var n in e)t[n]=e[n];return t}function n(t,e){return p.get("matchResponseProperty")!==!1?"string"==typeof p.get("matchResponseProperty")?e[p.get("matchResponseProperty")]===t:"function"==typeof p.get("matchResponseProperty")?p.get("matchResponseProperty")(e)===t:!0:!0}if(!(t.length<p.get("minCharNumber"))){if("list-required"!==p.get("data")){var i=p.get("data"),o=y.init(i);o=y.updateCategories(o,i),o=y.processData(o,t),l(o,t),A.parent().find("li").length>0?s():u()}var a=e();(void 0===a.url||""===a.url)&&(a.url=p.get("url")),(void 0===a.dataType||""===a.dataType)&&(a.dataType=p.get("dataType")),void 0!==a.url&&"list-required"!==a.url&&(a.url=a.url(t),a.data=p.get("preparePostData")(a.data,t),$.ajax(a).done(function(e){var i=y.init(e);i=y.updateCategories(i,e),i=y.convertXml(i),n(t,e)&&(i=y.processData(i,t),l(i,t)),y.checkIfDataExists(i)&&A.parent().find("li").length>0?s():u(),p.get("ajaxCallback")()}).fail(function(){h.warning("Fail to load response data")}).always(function(){}))}}switch(t.keyCode){case 27:u(),f();break;case 38:t.preventDefault(),S.length>0&&b>0&&(b-=1,A.val(p.get("getValue")(S[b])),c(b));break;case 40:t.preventDefault(),S.length>0&&b<S.length-1&&(b+=1,A.val(p.get("getValue")(S[b])),c(b));break;default:if(t.keyCode>40||8===t.keyCode){var n=A.val();p.get("list").hideOnEmptyPhrase!==!0||8!==t.keyCode||""!==n?p.get("requestDelay")>0?(void 0!==d&&clearTimeout(d),d=setTimeout(function(){e(n)},p.get("requestDelay"))):e(n):u()}}})}function n(){A.on("keydown",function(t){t=t||window.event;var e=t.keyCode;return 38===e?(suppressKeypress=!0,!1):void 0}).keydown(function(t){13===t.keyCode&&b>-1&&(A.val(p.get("getValue")(S[b])),b=-1,u(),p.get("list").onKeyEnterEvent(),p.get("list").onChooseEvent(),t.preventDefault())})}function i(){A.off("keypress")}function o(){A.focus(function(){""!==A.val()&&S.length>0&&(b=-1,s())})}function a(){A.blur(function(){setTimeout(function(){b=-1,u()},250)})}function r(){A.attr("autocomplete","off")}t()}function s(){C.trigger("show")}function u(){C.trigger("hide")}function c(t){C.trigger("selectElement",t)}function l(t,e){C.trigger("loadElements",[t,e])}function f(){A.trigger("blur")}var d,g={name:"EasyAutocomplete",shortcut:"eac"},m=new t.Constans,p=new t.Configuration(n),h=new t.Logger,v=new t.Template(n.template),y=new t.ListBuilderService(p,t.proccess),E=p.equals,A=e,C="",S=[],b=-1;this.getConstants=function(){return m},this.getConfiguration=function(){return p},this.getContainer=function(){return C},this.getSelectedItemIndex=function(){return b},this.getItemData=function(t){return S.length<t||void 0===S[t]?-1:S[t]},this.getSelectedItemData=function(){return this.getItemData(b)},this.build=function(){o()},this.init=function(){i()}},t}(EasyAutocomplete||{});$.fn.easyAutocompleteHandles=[],$.fn.easyAutocomplete=function(t){var e=new EasyAutocomplete.main(this,t);e.init(),$.fn.easyAutocompleteHandles[$(this).attr("id")]=e},$.fn.getSelectedItemIndex=function(){var t=$(this).attr("id");return void 0!==t&&void 0!==$.fn.easyAutocompleteHandles[t]?$.fn.easyAutocompleteHandles[t].getSelectedItemIndex():-1},$.fn.getItemData=function(t){var e=$(this).attr("id");return void 0!==e&&t>-1&&void 0!==$.fn.easyAutocompleteHandles[e]?$.fn.easyAutocompleteHandles[e].getItemData(t):-1},$.fn.getSelectedItemData=function(){var t=$(this).attr("id");return void 0!==t&&void 0!==$.fn.easyAutocompleteHandles[t]?$.fn.easyAutocompleteHandles[t].getSelectedItemData():-1};