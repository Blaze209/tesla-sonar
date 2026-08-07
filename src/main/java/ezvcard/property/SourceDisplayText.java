package ezvcard.property;

import ezvcard.VCardVersion;
import xj0.c;

/* JADX INFO: loaded from: classes8.dex */
@c({VCardVersion.V3_0})
public class SourceDisplayText extends TextProperty {
    public SourceDisplayText(String str) {
        super(str);
    }

    public SourceDisplayText(SourceDisplayText sourceDisplayText) {
        super(sourceDisplayText);
    }

    @Override // ezvcard.property.VCardProperty
    public SourceDisplayText copy() {
        return new SourceDisplayText(this);
    }
}
