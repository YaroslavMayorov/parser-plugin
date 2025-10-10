package org.language.cobol;


import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CobolTokenType extends IElementType {

    public CobolTokenType(@NotNull @NonNls String debugName) {
        super(debugName, CobolLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "CobolTokenType." + super.toString();
    }

}