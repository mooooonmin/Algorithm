-- 코드를 작성해주세요
SELECT
    COUNT(*) fish_count
FROM
    fish_info f
    LEFT JOIN fish_name_info n
    ON f.fish_type = n.fish_type
WHERE
    fish_name IN ('bass','snapper');