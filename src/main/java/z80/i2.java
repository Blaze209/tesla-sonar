package z80;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0013\u0010\u001bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, d2 = {"Lz80/i2;", "Li90/x;", "", AnnotatedPrivateKey.LABEL, "", "Lz80/u0;", "items", "<init>", "(ILjava/util/List;)V", "index", "", "f", "(I)Ljava/lang/String;", "rawValue", "a", "(Ljava/lang/String;)Ljava/lang/String;", "I", "getLabel", "()I", "b", "Ljava/util/List;", "c", "Ljava/lang/String;", "getDebugLabel", "()Ljava/lang/String;", "debugLabel", DateTokenConverter.CONVERTER_KEY, "()Ljava/util/List;", "rawItems", "e", "displayItems", "payments-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class i2 implements p010i90.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<DropdownItemSpec> items;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String debugLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> rawItems;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<String> displayItems;

    public i2(int i11, List<DropdownItemSpec> items) {
        p013kotlin.jvm.internal.s.k(items, "items");
        this.label = i11;
        this.items = items;
        this.debugLabel = "simple_dropdown";
        List<DropdownItemSpec> list = items;
        ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DropdownItemSpec) it.next()).getApiValue());
        }
        this.rawItems = arrayList;
        List<DropdownItemSpec> list2 = this.items;
        ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((DropdownItemSpec) it2.next()).getDisplayText());
        }
        this.displayItems = arrayList2;
    }

    @Override // p010i90.x
    public String a(String rawValue) {
        Object next;
        String displayText;
        p013kotlin.jvm.internal.s.k(rawValue, "rawValue");
        Iterator<T> it = this.items.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p013kotlin.jvm.internal.s.f(((DropdownItemSpec) next).getApiValue(), rawValue));
        DropdownItemSpec dropdownItemSpec = (DropdownItemSpec) next;
        return (dropdownItemSpec == null || (displayText = dropdownItemSpec.getDisplayText()) == null) ? this.items.get(0).getDisplayText() : displayText;
    }

    @Override // p010i90.x
    public List<String> b() {
        return this.rawItems;
    }

    @Override // p010i90.x
    /* JADX INFO: renamed from: c */
    public boolean getTinyMode() {
        return i90.x.a.b(this);
    }

    @Override // p010i90.x
    public boolean d() {
        return i90.x.a.a(this);
    }

    @Override // p010i90.x
    public List<String> e() {
        return this.displayItems;
    }

    @Override // p010i90.x
    public String f(int index) {
        return e().get(index);
    }

    @Override // p010i90.x
    public int getLabel() {
        return this.label;
    }
}
