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

<title>카츠돈가스</title>


<!-- 기본 CSS 처리 시작 -->
<%@ include file="/WEB-INF/views/include/basic.jsp"%>
<!-- 기본 CSS 처리 끝 -->

</head>
<body class="house">

	<!-- 해더 시작 -->
	<%@ include file="/WEB-INF/views/include/header.jsp"%>
	<!-- 해더 끝 -->

	<main role="main" class="container">

		<img src="<c:url value="/images/3티어.jpg"/>" class="tier">

		<h5>
			주소 : 서울 동작구 노량진로8길 21<br> 전화번호 : 02-823-0303<br> 맛 ★★★☆☆<br>
			양 ★★★☆☆<br> 가격 ★★★☆☆<br> <br> 추천메뉴 : 등심돈카츠 가격:12,000원<br>&nbsp;&nbsp;

			<img src="<c:url value="/images/카츠진 추천메뉴.jpg"/>"> <img
				src="<c:url value="/images/카츠 추가메뉴2.jpg"/>"> <img
				src="<c:url value="/images/카츠 추가메뉴 3.jpg"/>">

		</h5>
		<div id="map" style="width: 500px; height: 400px;"></div>

	</main>

	<script type="text/javascript"
		src="//dapi.kakao.com/v2/maps/sdk.js?appkey=67779cc042b4f88818dd13937369975d&libraries=services"></script>
	<script>
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
		mapOption = {
			center : new kakao.maps.LatLng(33.450701, 126.570667), // 지도의 중심좌표
			level : 3
		// 지도의 확대 레벨
		};

		// 지도를 생성합니다    
		var map = new kakao.maps.Map(mapContainer, mapOption);

		// 주소-좌표 변환 객체를 생성합니다
		var geocoder = new kakao.maps.services.Geocoder();

		// 주소로 좌표를 검색합니다
		geocoder
				.addressSearch(
						'서울 동작구 노량진로8길 21',
						function(result, status) {

							// 정상적으로 검색이 완료됐으면 
							if (status === kakao.maps.services.Status.OK) {

								var coords = new kakao.maps.LatLng(result[0].y,
										result[0].x);

								// 결과값으로 받은 위치를 마커로 표시합니다
								var marker = new kakao.maps.Marker({
									map : map,
									position : coords
								});

								// 인포윈도우로 장소에 대한 설명을 표시합니다
								var infowindow = new kakao.maps.InfoWindow(
										{
											content : '<div style="width:150px;text-align:center;padding:6px 0;">카츠</div>'
										});
								infowindow.open(map, marker);

								// 지도의 중심을 결과값으로 받은 위치로 이동시킵니다
								map.setCenter(coords);
							}
						});
	</script>


	<!--푸터 시작 -->
	<%@ include file="/WEB-INF/views/include/footer.jsp"%>
	<!-- 푸터 끝 -->
</body>
</html>
