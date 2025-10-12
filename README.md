# COBOL Mini Parser (IntelliJ Plugin)

A minimal IntelliJ Platform plugin that lexes and parses a subset of COBOL sufficient to handle the assignment program below. It includes syntax highlighting, PSI tree generation, and a basic parser built from a .flex lexer and a .bnf grammar.

### Scope

```code
01 IDENTIFICATION DIVISION.
02 PROGRAM-ID. HELLO.
03 DATA DIVISION.
04 WORKING-STORAGE SECTION.
05 01 WS-A PIC 9(2) VALUE 0.
06 PROCEDURE DIVISION.
07 A-PARA.
08 PERFORM B-PARA VARYING WS-A FROM 2 BY 2 UNTIL WS-A=12
09 STOP RUN.
10 B-PARA.
11 DISPLAY 'B-PARA ' WS-A.
12 DISPLAY 'B-PARA'.
```

### Design goals

Parse this program exactly, and not fail on minor adjustments (line reordering, duplication of lines/paragraphs, trivial whitespace).

Keep the grammar/lexer as small and focused as possible—only what’s needed.

## Project Structure

```bash
.
├── build.gradle.kts
├── gradle.properties
├── settings.gradle.kts
├── src
│   └── main
│       ├── java / kotlin
│       │   └── org/language/cobol/...
│       │       ├── CobolLanguage.kt / .java
│       │       ├── CobolFileType.kt / .java
│       │       ├── CobolLexerAdapter.kt
│       │       ├── CobolParserDefinition.kt
│       │       ├── CobolSyntaxHighlighter.kt
│       │       └── (color settings page, icons, etc. optional)
│       ├── gen/                       # GENERATED: lexer & parser (don’t edit)
│       ├── resources
│       │   ├── META-INF/plugin.xml    # plugin declaration
│       │   └── filetype icons, color demo text, etc.
│       └── grammar
│           ├── CobolLexer.flex        # JFlex spec
│           └── Cobol.bnf              # Grammar-Kit BNF
└── README.md
```

## Requirements

- JDK 17 (recommended for current Gradle + IntelliJ Platform)
- IntelliJ IDEA Community or Ultimate (2023.3+ recommended)
- Gradle
- Grammar-Kit and JFlex support in IDE (for regenerating parser/lexer)

## Usage

1) Clone & open
   ```bash
   git clone https://github.com/YaroslavMayorov/parser-plugin.git
   cd parser-plugin
   ```
   
2) Build
   ```bash
   ./gradlew build
   ```

3) Run the sandbox IDE
   ```bash
   ./gradlew runIde
   ```

This launches a separate IDE with your plugin installed.

4) Try it

- In the sandbox IDE, create a file hello.cobol.
- Paste the sample program.
- Install PSI Viewer to sandbox IDE.
- Open PSI Viewer in tools (right sidebar) to inspect tokens/PSI
- Check highlighting and that the file parses (no red error waves for the supported constructs).
