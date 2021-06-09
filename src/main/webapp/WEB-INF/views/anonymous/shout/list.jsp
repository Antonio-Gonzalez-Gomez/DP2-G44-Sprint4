<%@page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list readonly="true">
	<acme:list-column code="anonymous.shout.list.label.moment" path="moment" width="20%"/>
	<acme:list-column code="anonymous.shout.list.label.author" path="author" width="20%"/>
	<acme:list-column code="anonymous.shout.list.label.text" path="text" width="20%"/>
	<acme:list-column code="anonymous.shout.list.label.dude.pattern" path="dude.pattern" width="20%"/>
	<acme:list-column code="anonymous.shout.list.label.dude.money.amount" path="dude.money.amount" width="10%"/>
	<acme:list-column code="anonymous.shout.list.label.dude.money.currency" path="dude.money.currency" width="5%"/>
	
</acme:list>


