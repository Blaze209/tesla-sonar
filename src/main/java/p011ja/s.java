package p011ja;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p011ja.r;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B-\b\u0000\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\"\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R$\u0010)\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010+¨\u00064"}, d2 = {"Lja/s;", "Lja/r;", "D", "", "Lja/d0;", "navigator", "", "id", "", PlaceTypes.ROUTE, "<init>", "(Lja/d0;ILjava/lang/String;)V", "(Lja/d0;Ljava/lang/String;)V", "name", "Lja/h;", "argument", "Ljn0/h0;", "a", "(Ljava/lang/String;Lja/h;)V", "Lja/p;", "navDeepLink", "c", "(Lja/p;)V", "e", "()Lja/r;", "b", "Lja/d0;", "getNavigator", "()Lja/d0;", "I", "getId", "()I", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", AnnotatedPrivateKey.LABEL, "", "Ljava/util/Map;", "arguments", "", "f", "Ljava/util/List;", "deepLinks", "Lja/g;", "g", "actions", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class s<D extends r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d0<? extends D> navigator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String route;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private CharSequence label;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Map<String, h> arguments;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<p> deepLinks;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Map<Integer, g> actions;

    public s(d0<? extends D> navigator, int i11, String str) {
        p013kotlin.jvm.internal.s.k(navigator, "navigator");
        this.navigator = navigator;
        this.id = i11;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    public final void a(String name, h argument) {
        p013kotlin.jvm.internal.s.k(name, "name");
        p013kotlin.jvm.internal.s.k(argument, "argument");
        this.arguments.put(name, argument);
    }

    public D b() {
        D d11 = (D) e();
        d11.w(this.label);
        for (Map.Entry<String, h> entry : this.arguments.entrySet()) {
            d11.d(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.deepLinks.iterator();
        while (it.hasNext()) {
            d11.e((p) it.next());
        }
        for (Map.Entry<Integer, g> entry2 : this.actions.entrySet()) {
            d11.u(entry2.getKey().intValue(), entry2.getValue());
        }
        String str = this.route;
        if (str != null) {
            d11.y(str);
        }
        int i11 = this.id;
        if (i11 != -1) {
            d11.v(i11);
        }
        return d11;
    }

    public final void c(p navDeepLink) {
        p013kotlin.jvm.internal.s.k(navDeepLink, "navDeepLink");
        this.deepLinks.add(navDeepLink);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    protected D e() {
        return (D) this.navigator.a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s(d0<? extends D> navigator, String str) {
        this(navigator, -1, str);
        p013kotlin.jvm.internal.s.k(navigator, "navigator");
    }
}
