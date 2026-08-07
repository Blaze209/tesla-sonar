package androidx.core.view;

import android.view.Menu;
import android.view.MenuItem;
import java.util.Iterator;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroid/view/Menu;", "", "Landroid/view/MenuItem;", "b", "(Landroid/view/Menu;)Ljava/util/Iterator;", "Lho0/i;", "a", "(Landroid/view/Menu;)Lho0/i;", "children", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class t {

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/core/view/t$a", "Lho0/i;", "Landroid/view/MenuItem;", "", "iterator", "()Ljava/util/Iterator;", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements ho0.i<MenuItem> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Menu f7851a;

        a(Menu menu) {
            this.f7851a = menu;
        }

        @Override // ho0.i
        public Iterator<MenuItem> iterator() {
            return t.b(this.f7851a);
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/core/view/t$b", "", "Landroid/view/MenuItem;", "", "hasNext", "()Z", "b", "()Landroid/view/MenuItem;", "Ljn0/h0;", "remove", "()V", "", "a", "I", "index", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Iterator<MenuItem>, xn0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Menu f7853b;

        b(Menu menu) {
            this.f7853b = menu;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MenuItem next() {
            Menu menu = this.f7853b;
            int i11 = this.index;
            this.index = i11 + 1;
            MenuItem item = menu.getItem(i11);
            if (item != null) {
                return item;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.f7853b.size();
        }

        @Override // java.util.Iterator
        public void remove() {
            jn0.h0 h0Var;
            Menu menu = this.f7853b;
            int i11 = this.index - 1;
            this.index = i11;
            MenuItem item = menu.getItem(i11);
            if (item != null) {
                menu.removeItem(item.getItemId());
                h0Var = jn0.h0.f84049a;
            } else {
                h0Var = null;
            }
            if (h0Var == null) {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public static final ho0.i<MenuItem> a(Menu menu) {
        return new a(menu);
    }

    public static final Iterator<MenuItem> b(Menu menu) {
        return new b(menu);
    }
}
