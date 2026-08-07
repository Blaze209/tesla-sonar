package po0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0012\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lpo0/h;", "Output", "Lpo0/n;", "", "Lpo0/e;", "consumers", "<init>", "(Ljava/util/List;)V", PlaceTypes.STORAGE, "", "input", "", "startIndex", "Lpo0/j;", "a", "(Ljava/lang/Object;Ljava/lang/CharSequence;I)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "I", "minLength", "", "Z", "isFlexible", DateTokenConverter.CONVERTER_KEY, "whatThisExpects", "kotlinx-datetime"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class h<Output> implements n<Output> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<e<Output>> consumers;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int minLength;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isFlexible;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Output", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ h<Output> f103491c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h<Output> hVar) {
            super(0);
            this.f103491c = hVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Unexpected end of input: yet to parse " + this.f103491c.d();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Output", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l0 f103492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h<Output> f103493d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(l0 l0Var, h<Output> hVar) {
            super(0);
            this.f103492c = l0Var;
            this.f103493d = hVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Only found " + this.f103492c.f86527a + " digits in a row, but need to parse " + this.f103493d.d();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Output", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f103494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h<Output> f103495d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f103496e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f103497f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, h<Output> hVar, int i11, g gVar) {
            super(0);
            this.f103494c = str;
            this.f103495d = hVar;
            this.f103496e = i11;
            this.f103497f = gVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Can not interpret the string '" + this.f103494c + "' as " + this.f103495d.c().get(this.f103496e).getWhatThisExpects() + ": " + this.f103497f.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(List<? extends e<? super Output>> consumers) {
        boolean z11;
        boolean z12;
        int i11;
        p013kotlin.jvm.internal.s.k(consumers, "consumers");
        this.consumers = consumers;
        Iterator it = consumers.iterator();
        int i12 = 0;
        while (true) {
            int iIntValue = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer length = ((e) it.next()).getLength();
            if (length != null) {
                iIntValue = length.intValue();
            }
            i12 += iIntValue;
        }
        this.minLength = i12;
        List<e<Output>> list = this.consumers;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((e) it2.next()).getLength() == null) {
                        z11 = true;
                        break;
                    }
                } else {
                    z11 = false;
                    break;
                }
            }
        } else {
            z11 = false;
            break;
        }
        this.isFlexible = z11;
        List<e<Output>> list2 = this.consumers;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z12 = true;
                    break;
                }
                Integer length2 = ((e) it3.next()).getLength();
                if (!((length2 != null ? length2.intValue() : Integer.MAX_VALUE) > 0)) {
                    z12 = false;
                    break;
                }
            }
        } else {
            z12 = true;
            break;
        }
        if (!z12) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        List<e<Output>> list3 = this.consumers;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            i11 = 0;
        } else {
            Iterator<T> it4 = list3.iterator();
            i11 = 0;
            while (it4.hasNext()) {
                if ((((e) it4.next()).getLength() == null) && (i11 = i11 + 1) < 0) {
                    v.w();
                }
            }
        }
        if (i11 <= 1) {
            return;
        }
        List<e<Output>> list4 = this.consumers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list4) {
            if (((e) obj).getLength() == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList2.add(((e) it5.next()).getWhatThisExpects());
        }
        throw new IllegalArgumentException(("At most one variable-length numeric field in a row is allowed, but got several: " + arrayList2 + ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d() {
        String str;
        List<e<Output>> list = this.consumers;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            StringBuilder sb2 = new StringBuilder();
            Integer length = eVar.getLength();
            if (length == null) {
                str = "at least one digit";
            } else {
                str = length + " digits";
            }
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(eVar.getWhatThisExpects());
            arrayList.add(sb2.toString());
        }
        if (this.isFlexible) {
            return "a number with at least " + this.minLength + " digits: " + arrayList;
        }
        return "a number with exactly " + this.minLength + " digits: " + arrayList;
    }

    @Override // po0.n
    public Object a(Output storage, CharSequence input, int startIndex) {
        p013kotlin.jvm.internal.s.k(input, "input");
        if (this.minLength + startIndex > input.length()) {
            return j.INSTANCE.a(startIndex, new a(this));
        }
        l0 l0Var = new l0();
        while (l0Var.f86527a + startIndex < input.length() && mo0.d.b(input.charAt(l0Var.f86527a + startIndex))) {
            l0Var.f86527a++;
        }
        if (l0Var.f86527a < this.minLength) {
            return j.INSTANCE.a(startIndex, new b(l0Var, this));
        }
        int size = this.consumers.size();
        int i11 = 0;
        while (i11 < size) {
            Integer length = this.consumers.get(i11).getLength();
            int iIntValue = (length != null ? length.intValue() : (l0Var.f86527a - this.minLength) + 1) + startIndex;
            g gVarA = this.consumers.get(i11).a(storage, input, startIndex, iIntValue);
            if (gVarA != null) {
                return j.INSTANCE.a(startIndex, new c(input.subSequence(startIndex, iIntValue).toString(), this, i11, gVarA));
            }
            i11++;
            startIndex = iIntValue;
        }
        return j.INSTANCE.b(startIndex);
    }

    public final List<e<Output>> c() {
        return this.consumers;
    }

    public String toString() {
        return d();
    }
}
