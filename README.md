# CSC270-work

# Louisa May Alcott, *Little Women*

A citable digital edition.

**Status**: <span style="color: red;">In progress</span>.

## Bibliography

Text: `urn:cts:fuTexts:alcott.lw.boggis:`

*Little Women*, By Louisa May Alcott. Published originally in two volumes in 1868 and 1869 By Roberts Brothers.

Louisa May Alcott was not only an author, but a former Civil War nurse, feminist, and abolitionist. She studied under writers and poets, Henry David Thoreau and Ralph Waldo Emerson.

*Little Women* was Louisa May Alcott's most successful work both financially and popularity wise. She based her writing on her family as well as her own life. Jo, Amy, Meg and Beth were based on her and her sisters, and she incorporated parts of her life throughout the text. This is part of the reason she was able to finish writing in just a few months.

Basic bibliography:

- Miller, E CE. “These 10 Facts Are Proof That Louisa May Alcott Was Jo March IRL.” _Bustle_, www.bustle.com/p/10-fascinating-facts-about-little-women-author-louisa-may-alcott-2953900.

A plain-text, citable edition following the protocols of the [CITE Architecture](http://cite-architecture.org). The file in `text/lw.cex` is intended for machine-processing and has been validated as to character-set and spelling.

There is a human-readable HTML site, derived from the `.cex` file, in `html/`. The scripts that generated that site are in `/src/main/scala/`.

Included Scala scripts take advantage of the code libraries in the [CITE Architecture](http://cite-architecture.org).

This version of this text is [in the Public Domain](http://creativecommons.org/licenses/by/4.0/):

![license](http://i.creativecommons.org/p/zero/1.0/88x31.png)


## Running Scripts for Validation, Publication, and Analysis

This repository is an SBT project for running Scala code. Everything should be reproducible.

### Requirements

- A Java JDK 1.8 or higher.
- [SBT](https://www.scala-sbt.org) Installed and on the PATH.

### Running

- Clone this repository.
- Navigate to this repository's root level.
- `$ sbt console`
- `scala> :load scripts/corpus-char-validate.sc`
- etc.

## Code Contents


## Character Validation

The text has been machine validated as to character-set using [a Scala script](https://github.com/loganboggis/CSC270-work/blob/master/scripts/corpus-char-validate.sc). The following is a complete inventory of the characters present in this text:

<div style="font-size: 25%;">

| Character | Character | Character | Character | Character |
|-----------|-----------|-----------|-----------|-----------|
| `space` (20) | `!` (21) | `"` (22) | `$` (24) | `&` (26) |
| `'` (27) | `(` (28) | `)` (29) | `,` (2c) | `-` (2d) |
| `.` (2e) | `0` (30) | `1` (31) | `2` (32) | `6` (36) |
| `7` (37) | `8` (38) | `:` (3a) | `;` (3b) | `?` (3f) |
| `A` (41) | `B` (42) | `C` (43) | `D` (44) | `E` (45) |
| `F` (46) | `G` (47) | `H` (48) | `I` (49) | `J` (4a) |
| `K` (4b) | `L` (4c) | `M` (4d) | `N` (4e) | `O` (4f) |
| `P` (50) | `Q` (51) | `R` (52) | `S` (53) | `T` (54) |
| `U` (55) | `V` (56) | `W` (57) | `X` (58) | `Y` (59) |
| `Z` (5a) | `[` (5b) | `]` (5d) | `_` (5f) | `a` (61) |
| `b` (62) | `c` (63) | `d` (64) | `e` (65) | `f` (66) |
| `g` (67) | `h` (68) | `i` (69) | `j` (6a) | `k` (6b) |
| `l` (6c) | `m` (6d) | `n` (6e) | `o` (6f) | `p` (70) |
| `q` (71) | `r` (72) | `s` (73) | `t` (74) | `u` (75) |
| `v` (76) | `w` (77) | `x` (78) | `y` (79) | `z` (7a) |
| `à` (e0) | `…` (2026) |

</div>

Confirm character-validation with:

~~~
$ sbt console
scala> :load scripts/corpus-char-validate.sc
~~~

This will generate a file `validation-data/charTable.md` containing each distinct character present in the text, with its Unicode value.

-------
A special thanks to Sarah for helping me add the headers to my individual HTML pages. It wouldn't work just making the changes on my index.html and web-writer.scala. And thank you to Dr. Blackwell for a great semester! Happy Holidays!
-----------
