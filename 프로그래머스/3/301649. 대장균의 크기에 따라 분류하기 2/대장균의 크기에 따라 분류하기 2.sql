-- 코드를 작성해주세요
SELECT ID,
    CASE
        WHEN ntile(4) over(ORDER BY SIZE_OF_COLONY DESC) = 1 THEN 'CRITICAL'
        WHEN ntile(4) over(ORDER BY SIZE_OF_COLONY DESC) = 2 THEN 'HIGH'
        WHEN ntile(4) over(ORDER BY SIZE_OF_COLONY DESC) = 3 THEN 'MEDIUM'
        WHEN ntile(4) over(ORDER BY SIZE_OF_COLONY DESC) = 4 THEN 'LOW'
    END AS COLONY_NAME
FROM ECOLI_DATA
ORDER BY ID