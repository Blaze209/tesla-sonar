package yj0;

import ak0.s0;
import ezvcard.VCard;
import ezvcard.property.Address;
import ezvcard.property.Label;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final List<b> f125636a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected s0 f125637b = new s0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected a f125638c;

    protected abstract VCard c();

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(VCard vCard, List<Label> list) {
        List<Address> listE = vCard.e();
        for (Label label : list) {
            HashSet hashSet = new HashSet(label.getTypes());
            Iterator<Address> it = listE.iterator();
            while (true) {
                if (!it.hasNext()) {
                    vCard.b(label);
                    break;
                }
                Address next = it.next();
                if (next.getLabel() == null && new HashSet(next.getTypes()).equals(hashSet)) {
                    next.setLabel(label.getValue());
                    break;
                }
            }
        }
    }

    public List<b> o() {
        return new ArrayList(this.f125636a);
    }

    public VCard p() {
        this.f125636a.clear();
        this.f125638c = new a();
        return c();
    }

    public void t(s0 s0Var) {
        this.f125637b = s0Var;
    }
}
