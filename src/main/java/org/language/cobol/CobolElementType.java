package org.language.cobol;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class CobolElementType extends IElementType {

    public CobolElementType(@NotNull @NonNls String debugName) {
        super(debugName, CobolLanguage.INSTANCE);
    }
}