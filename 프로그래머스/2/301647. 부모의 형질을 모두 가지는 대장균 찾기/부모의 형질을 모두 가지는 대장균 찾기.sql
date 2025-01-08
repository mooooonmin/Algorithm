-- 코드를 작성해주세요
SELECT
    a.id,
    a.genotype,
    b.genotype as parent_genotype
FROM
    ecoli_data a
    LEFT JOIN ecoli_data b
    ON a.parent_id = b.id
WHERE 
    a.genotype & b.genotype = b.genotype
ORDER BY
    1;