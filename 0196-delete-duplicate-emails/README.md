<h2><a href="https://leetcode.com/problems/delete-duplicate-emails/">196. Delete Duplicate Emails</a></h2><h3>Easy</h3><hr><div class="sql-schema-wrapper__3VBi"><a class="sql-schema-link__3cEg">SQL Schema<svg viewBox="0 0 24 24" width="1em" height="1em" class="icon__1Md2"><path fill-rule="evenodd" d="M10 6L8.59 7.41 13.17 12l-4.58 4.59L10 18l6-6z"></path></svg></a></div><div><p>Table: <code>Person</code></p>

<pre style="position: relative;">+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| email       | varchar |
+-------------+---------+
id is the primary key (column with unique values) for this table.
Each row of this table contains an email. The emails will not contain uppercase letters.
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre>

<p>&nbsp;</p>

<p>Write a solution to<strong> delete</strong> all duplicate emails, keeping only one unique email with the smallest <code>id</code>.</p>

<p>For SQL users, please note that you are supposed to write a <code>DELETE</code> statement and not a <code>SELECT</code> one.</p>

<p>For Pandas users, please note that you are supposed to modify <code>Person</code> in place.</p>

<p>After running your script, the answer shown is the <code>Person</code> table. The driver will first compile and run your piece of code and then show the <code>Person</code> table. The final order of the <code>Person</code> table <strong>does not matter</strong>.</p>

<p>The result format is in the following example.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre style="position: relative;"><strong>Input:</strong> 
Person table:
+----+------------------+
| id | email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
| 3  | john@example.com |
+----+------------------+
<strong>Output:</strong> 
+----+------------------+
| id | email            |
+----+------------------+
| 1  | john@example.com |
| 2  | bob@example.com  |
+----+------------------+
<strong>Explanation:</strong> john@example.com is repeated two times. We keep the row with the smallest Id = 1.
<div class="open_grepper_editor" title="Edit &amp; Save To Grepper"></div></pre>
</div>