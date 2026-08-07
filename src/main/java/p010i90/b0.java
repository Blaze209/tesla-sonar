package p010i90;

import i4.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o4.TransformedText;
import o4.f0;
import o4.z0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0012"}, d2 = {"Li90/b0;", "Lo4/z0;", "<init>", "()V", "", "output", "", "", "a", "(Ljava/lang/String;)Ljava/util/List;", "b", "Li4/d;", "text", "Lo4/x0;", "filter", "(Li4/d;)Lo4/x0;", "Ljava/lang/String;", "separator", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String separator = " / ";

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"i90/b0$a", "Lo4/f0;", "", "offset", "originalToTransformed", "(I)I", "transformedToOriginal", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<Integer> f76323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Integer> f76324b;

        a(List<Integer> list, List<Integer> list2) {
            this.f76323a = list;
            this.f76324b = list2;
        }

        @Override // o4.f0
        public int originalToTransformed(int offset) {
            return this.f76323a.get(offset).intValue();
        }

        @Override // o4.f0
        public int transformedToOriginal(int offset) {
            List<Integer> list = this.f76324b;
            int i11 = 0;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((Number) it.next()).intValue() < offset && (i11 = i11 + 1) < 0) {
                        v.w();
                    }
                }
            }
            return offset - i11;
        }
    }

    private final List<Integer> a(String output) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (i11 < output.length()) {
            char cCharAt = output.charAt(i11);
            int i13 = i12 + 1;
            Integer numValueOf = Integer.valueOf(i12);
            if (!Character.isDigit(cCharAt)) {
                numValueOf = null;
            }
            Integer numValueOf2 = numValueOf != null ? Integer.valueOf(numValueOf.intValue() + 1) : null;
            if (numValueOf2 != null) {
                arrayList.add(numValueOf2);
            }
            i11++;
            i12 = i13;
        }
        return v.Q0(v.P0(v.e(0), v.j0(arrayList, 1)), Integer.valueOf(output.length()));
    }

    private final List<Integer> b(String output) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        int i12 = 0;
        while (i11 < output.length()) {
            char cCharAt = output.charAt(i11);
            int i13 = i12 + 1;
            Integer numValueOf = Integer.valueOf(i12);
            if (Character.isDigit(cCharAt)) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
            i11++;
            i12 = i13;
        }
        return arrayList;
    }

    @Override // o4.z0
    public TransformedText filter(d text) {
        s.k(text, "text");
        int i11 = (((!t.y0(text) && text.charAt(0) != '0' && text.charAt(0) != '1') || (text.length() > 1 && Integer.parseInt(t.T1(text.getText(), 2)) > 12)) ? 1 : 0) ^ 1;
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < text.length(); i12++) {
            sb2.append(text.charAt(i12));
            if (i12 == i11) {
                sb2.append(this.separator);
            }
        }
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return new TransformedText(new d(string, null, null, 6, null), new a(a(string), b(string)));
    }
}
