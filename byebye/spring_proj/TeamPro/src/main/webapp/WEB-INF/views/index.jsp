<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Index</title>

<!-- 기본 CSS 처리 시작 -->
<%@ include file="/WEB-INF/views/include/basic.jsp"%>
<!-- 기본 CSS 처리 끝 -->

</head>
<body>

<header>	

	<%@ include file="/WEB-INF/views/include/header.jsp"%>	
</header>

	<!-- 메인 컨텐트 시작 -->
	<main role="main" class="container">
		<div
			class="d-flex align-items-center p-3 my-3 text-white-50 bg-purple rounded box-shadow">
			<img class="mr-3"
				src="https://getbootstrap.com/assets/brand/bootstrap-outline.svg"
				alt="" width="48" height="48">
			<div class="lh-100">
				<h6 class="mb-0 text-white lh-100">서울 돈가스 맛집 TOP 9</h6>
				<small>#맛 #양 #가격 #존맛탱 #JMT</small>
			</div>
		</div>

		<div id="deck" class="my-3 p-3 bg-white rounded box-shadow">
			<h6 class="border-bottom border-gray pb-2 mb-0">서울 돈가스 맛집 TOP 9 리스트</h6>

			<div class="card-deck">
			
				<div class="card">
					<img src="<c:url value="/images/긴자바이린.jpg"/>" class="card-img-top"
						alt="...">
					<div class="card-body">
						<a href="/mm/pork/gindon.jsp" class="card-title">긴자바이린</a>
								
					</div>
					
					<div class="card-footer">
						<small class="text-muted">Last updated 3 mins ago</small>
					</div>
				</div>

				<div class="card">
					<img src="<c:url value="/images/독립카츠.jpg"/>" class="card-img-top"
						alt="...">
					<div class="card-body">
						<a href="/mm/pork/doklipdon.jsp" class="card-title">독립카츠</a>
					</div>
					<div class="card-footer">
						<small class="text-muted">Last updated 3 mins ago</small>
					</div>
				</div>

				<div class="card">
					<img src="<c:url value="/images/아빠곰 수제 돈까스.jpg"/>"
						class="card-img-top" alt="...">
					<div class="card-body">
						<a href="/mm/pork/daddon.jsp" class="card-title">아빠곰 수제돈까스</a>
					</div>
					<div class="card-footer">
						<small class="text-muted">Last updated 3 mins ago</small>
					</div>
				</div>
			</div>

			<p class="d-block text-right mt-3"> </p>

			<div class="card-deck">
				<div class="card">

					<img src="<c:url value="/images/안즈.jpg"/>" class="card-img-top"
						alt="">
					<div class="card-body">
						<a href="/mm/pork/anzdon.jsp" class="card-title">안즈</a>
					</div>
					<div class="card-footer">
						<small class="text-muted">Last updated 3 mins ago</small>
					</div>
				</div>

				<div class="card">
					<img src="<c:url value="/images/정돈.jpg"/>" class="card-img-top"
						alt="...">
					<div class="card-body">
						<a href="/mm/pork/jung.jsp" class="card-title">정돈</a>
					</div>
					<div class="card-footer">
						<small class="text-muted">Last updated 3 mins ago</small>
					</div>
				</div>

				<div class="card">
					<img src="<c:url value="/images/즐거운 맛 돈까스.jpg"/>" class="card-img-top"
						alt="...">
					<div class="card-body">
						<a href="/mm/pork/KINdon.jsp" class="card-title">즐거운 맛 돈까스</a>
					</div>
					<div class="card-footer">
						<small class="text-muted">Last updated 3 mins ago</small>
					</div>
				</div>
			</div>
			
			<p class="d-block text-right mt-3"> </p>
					
			<div class="card-deck">
			
			<div class="card">
				<img src=<c:url value="/images/카츠진.jpg"/> class="card-img-top"
					alt="">
				<div class="card-body">
					<a href="/mm/pork/kazdon.jsp" class="card-title">카츠진</a>
				</div>
				<div class="card-footer">
					<small class="text-muted">Last updated 3 mins ago</small>
				</div>
			</div>

			<div class="card">
				<img src="<c:url value="/images/크레이지카츠.jpg"/>" class="card-img-top"
					alt="...">
				<div class="card-body">
					<a href="/mm/pork/crazydon.jsp" class="card-title">크레이지 카츠</a>
				</div>
				<div class="card-footer">
					<small class="text-muted">Last updated 3 mins ago</small>
				</div>
			</div>

			<div class="card">
				<img src="<c:url value="/images/삼백돈 돈가츠.jpg"/>" class="card-img-top"
					alt="...">
				<div class="card-body">
					<a href="/mm/pork/300don.jsp" class="card-title">삼백돈</a>
				</div>
				<div class="card-footer">
					<small class="text-muted">Last updated 3 mins ago</small>
				</div>
			</div>
			</div>
			
			<a href="/mm/WEB-INF/jung.jsp">후기</a>

		</div>

	
		
	</main>


	<!-- 메인 컨텐트 끝 -->

<footer>
	
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
	
</footer>


</body>
</html>