-- 코드를 작성해주세요
SELECT 
    FI.ID, 
    FN.FISH_NAME, 
    FI.LENGTH
FROM 
(
    SELECT 
        ID, 
        FISH_TYPE, 
        LENGTH, 
        RANK() OVER(PARTITION BY FISH_TYPE ORDER BY LENGTH DESC) BF 
    FROM FISH_INFO
) FI
JOIN FISH_NAME_INFO FN 
ON FI.FISH_TYPE = FN.FISH_TYPE
WHERE FI.BF = 1
ORDER BY ID ASC