<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-textbox code="anonymous.shout.form.label.author" path="author" placeholder = "David Barragán Salazar"/>
	<acme:form-textarea code="anonymous.shout.form.label.text" path="text" placeholder = "Dude"/>
	<acme:form-textbox code="anonymous.shout.form.label.info" path="info" placeholder = "www.example.com"/>
	<acme:form-textbox code="anonymous.shout.form.label.dude.pattern" path="dude.pattern" placeholder = "YYYYMMDD"/>
	<acme:form-textbox code="anonymous.shout.form.label.dude.money.currency" path="dude.money.currency" placeholder = "$ o €"/>
	<acme:form-textbox code="anonymous.shout.form.label.dude.money.amount" path="dude.money.amount" placeholder = "123.456"/>
	<acme:form-checkbox code="anonymous.shout.form.label.dude.shoutisdude" path="dude.shoutisdude"/>
	<acme:form-submit code="anonymous.shout.form.button.create" action="/anonymous/shout/create"/>
  	<acme:form-return code="anonymous.shout.form.button.return"/>
</acme:form>
