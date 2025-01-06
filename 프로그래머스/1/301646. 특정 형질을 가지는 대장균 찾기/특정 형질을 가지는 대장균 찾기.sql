-- 코드를 작성해주세요
SELECT COUNT(*) AS COUNT
FROM ECOLI_DATA
-- 2번 형질을 보유하지 않음
WHERE (GENOTYPE & 2) = 0
  -- 1번이나 3번 형질을 보유
  AND ((GENOTYPE & 1) > 0 OR (GENOTYPE & 4) > 0)
  ;

