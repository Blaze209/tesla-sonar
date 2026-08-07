package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import n90.FormFieldEntry;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003¨\u0006\u0005"}, d2 = {"Ln90/a;", "entry", "c", "(Ln90/a;)Ln90/a;", DateTokenConverter.CONVERTER_KEY, "payments-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class e0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final FormFieldEntry c(FormFieldEntry formFieldEntry) {
        String value = formFieldEntry.getValue();
        int iIntValue = -1;
        if (value != null) {
            String strA = p010i90.s.a(value);
            if (strA.length() == 4) {
                Integer numX = p013kotlin.text.t.x(p013kotlin.text.t.T1(strA, 2));
                if (numX == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                iIntValue = numX.intValue();
            }
        }
        return FormFieldEntry.b(formFieldEntry, p013kotlin.text.t.K0(String.valueOf(iIntValue), 2, '0'), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FormFieldEntry d(FormFieldEntry formFieldEntry) {
        String value = formFieldEntry.getValue();
        int iIntValue = -1;
        if (value != null) {
            String strA = p010i90.s.a(value);
            if (strA.length() == 4) {
                Integer numX = p013kotlin.text.t.x(p013kotlin.text.t.U1(strA, 2));
                if (numX == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                iIntValue = numX.intValue() + 2000;
            }
        }
        return FormFieldEntry.b(formFieldEntry, String.valueOf(iIntValue), false, 2, null);
    }
}
