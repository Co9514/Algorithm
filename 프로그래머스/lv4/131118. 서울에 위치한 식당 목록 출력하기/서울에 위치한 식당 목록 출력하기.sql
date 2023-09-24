-- 코드를 입력하세요
SELECT info.REST_ID, info.REST_NAME, info.FOOD_TYPE, info.FAVORITES, info.ADDRESS, round(avg(review.review_score), 2) as SCORE
from REST_REVIEW as review
left join REST_INFO as info on review.rest_id = info.rest_id
where info.address like ('서울%')
group by review.rest_id
order by score DESC, info.favorites DESC