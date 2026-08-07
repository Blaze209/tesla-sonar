package p011ja;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.collection.a1;
import androidx.collection.y0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ho0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.collections.m;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.text.t;
import wn0.a;
import wn0.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 g2\u00020\u0001:\u0002<AB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020 2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b!\u0010\"J!\u0010$\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0010H\u0017¢\u0006\u0004\b&\u0010'J\u001f\u0010,\u001a\u00020\u00142\b\b\u0001\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u001d\u00100\u001a\u00020\u00142\u0006\u0010.\u001a\u00020\u00022\u0006\u0010/\u001a\u00020\u000e¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u0004\u0018\u00010#2\b\u00102\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0002H\u0016¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\u00102\b\u00107\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020(H\u0016¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u00106R.\u0010G\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010=R$\u0010P\u001a\u0004\u0018\u00010J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020\t0Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010RR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020*0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\"\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR,\u0010\\\u001a\u00020(2\b\b\u0001\u0010\\\u001a\u00020(8G@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010]\u001a\u0004\b^\u0010;\"\u0004\b_\u0010`R.\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010=\u001a\u0004\ba\u00106\"\u0004\bb\u0010\u0005R\u001e\u0010f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0014\u0010j\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u00106¨\u0006k"}, d2 = {"Lja/r;", "", "", "navigatorName", "<init>", "(Ljava/lang/String;)V", "Lja/d0;", "navigator", "(Lja/d0;)V", "Lja/p;", "deepLink", "Landroid/net/Uri;", "uri", "", "Lja/h;", "arguments", "", "q", "(Lja/p;Landroid/net/Uri;Ljava/util/Map;)Z", "navDeepLink", "Ljn0/h0;", "e", "(Lja/p;)V", PlaceTypes.ROUTE, "Lja/r$b;", "t", "(Ljava/lang/String;)Lja/r$b;", "Lja/q;", "navDeepLinkRequest", "s", "(Lja/q;)Lja/r$b;", "previousDestination", "", IntegerTokenConverter.CONVERTER_KEY, "(Lja/r;)[I", "Landroid/os/Bundle;", "r", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "z", "()Z", "", "actionId", "Lja/g;", "action", "u", "(ILja/g;)V", "argumentName", "argument", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Lja/h;)V", "args", "h", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "n", "Lja/t;", "<set-?>", "b", "Lja/t;", "o", "()Lja/t;", "x", "(Lja/t;)V", "parent", "c", "idName", "", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "w", "(Ljava/lang/CharSequence;)V", AnnotatedPrivateKey.LABEL, "", "Ljava/util/List;", "deepLinks", "Landroidx/collection/y0;", "f", "Landroidx/collection/y0;", "actions", "", "g", "Ljava/util/Map;", "_arguments", "id", "I", "m", "v", "(I)V", "p", "y", "Lkotlin/Lazy;", "j", "Lkotlin/Lazy;", "routeDeepLink", "k", "()Ljava/util/Map;", "l", "displayName", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class r {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Map<String, Class<?>> f83380l = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String navigatorName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private t parent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String idName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private CharSequence label;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<p> deepLinks;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final y0<g> actions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Map<String, h> _arguments;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int id;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String route;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Lazy<p> routeDeepLink;

    /* JADX INFO: renamed from: ja.r$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000f*\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lja/r$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "id", "", "b", "(Landroid/content/Context;I)Ljava/lang/String;", PlaceTypes.ROUTE, "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lja/r;", "Lho0/i;", "c", "(Lja/r;)Lho0/i;", "getHierarchy$annotations", "(Lja/r;)V", "hierarchy", "", "Ljava/lang/Class;", "classes", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: ja.r$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lja/r;", "it", "a", "(Lja/r;)Lja/r;"}, k = 3, mv = {1, 8, 0})
        static final class C1755a extends u implements l<r, r> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C1755a f83391c = new C1755a();

            C1755a() {
                super(1);
            }

            @Override // wn0.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r invoke(r it) {
                s.k(it, "it");
                return it.getParent();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(String route) {
            if (route == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + route;
        }

        public final String b(Context context, int id2) {
            String strValueOf;
            s.k(context, "context");
            if (id2 <= 16777215) {
                return String.valueOf(id2);
            }
            try {
                strValueOf = context.getResources().getResourceName(id2);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(id2);
            }
            s.j(strValueOf, "try {\n                  …tring()\n                }");
            return strValueOf;
        }

        public final i<r> c(r rVar) {
            s.k(rVar, "<this>");
            return ho0.l.q(rVar, C1755a.f83391c);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, d2 = {"Lja/r$b;", "", "Lja/r;", "destination", "Landroid/os/Bundle;", "matchingArgs", "", "isExactDeepLink", "", "matchingPathSegments", "hasMatchingAction", "mimeTypeMatchLevel", "<init>", "(Lja/r;Landroid/os/Bundle;ZIZI)V", "other", "a", "(Lja/r$b;)I", "arguments", DateTokenConverter.CONVERTER_KEY, "(Landroid/os/Bundle;)Z", "Lja/r;", "b", "()Lja/r;", "Landroid/os/Bundle;", "c", "()Landroid/os/Bundle;", "Z", "I", "e", "f", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final r destination;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Bundle matchingArgs;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isExactDeepLink;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int matchingPathSegments;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean hasMatchingAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final int mimeTypeMatchLevel;

        public b(r destination, Bundle bundle, boolean z11, int i11, boolean z12, int i12) {
            s.k(destination, "destination");
            this.destination = destination;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z11;
            this.matchingPathSegments = i11;
            this.hasMatchingAction = z12;
            this.mimeTypeMatchLevel = i12;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b other) {
            s.k(other, "other");
            boolean z11 = this.isExactDeepLink;
            if (z11 && !other.isExactDeepLink) {
                return 1;
            }
            if (!z11 && other.isExactDeepLink) {
                return -1;
            }
            int i11 = this.matchingPathSegments - other.matchingPathSegments;
            if (i11 > 0) {
                return 1;
            }
            if (i11 < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.matchingArgs;
                s.h(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z12 = this.hasMatchingAction;
            if (z12 && !other.hasMatchingAction) {
                return 1;
            }
            if (z12 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final r getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        public final boolean d(Bundle arguments) {
            Bundle bundle;
            Object objA;
            if (arguments == null || (bundle = this.matchingArgs) == null) {
                return false;
            }
            Set<String> setKeySet = bundle.keySet();
            s.j(setKeySet, "matchingArgs.keySet()");
            for (String key : setKeySet) {
                if (!arguments.containsKey(key)) {
                    return false;
                }
                h hVar = (h) this.destination._arguments.get(key);
                Object objA2 = null;
                b0<Object> b0VarA = hVar != null ? hVar.a() : null;
                if (b0VarA != null) {
                    Bundle bundle2 = this.matchingArgs;
                    s.j(key, "key");
                    objA = b0VarA.a(bundle2, key);
                } else {
                    objA = null;
                }
                if (b0VarA != null) {
                    s.j(key, "key");
                    objA2 = b0VarA.a(arguments, key);
                }
                if (b0VarA != null && !b0VarA.j(objA, objA2)) {
                    return false;
                }
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Action.KEY_ATTRIBUTE, "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements l<String, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f83398c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(p pVar) {
            super(1);
            this.f83398c = pVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            s.k(key, "key");
            return Boolean.valueOf(!this.f83398c.j().contains(key));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Action.KEY_ATTRIBUTE, "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements l<String, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Bundle f83399c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Bundle bundle) {
            super(1);
            this.f83399c = bundle;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            s.k(key, "key");
            return Boolean.valueOf(!this.f83399c.containsKey(key));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lja/p;", "b", "()Lja/p;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements a<p> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83400c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(0);
            this.f83400c = str;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p invoke() {
            return new p.a().b(this.f83400c).a();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", Action.KEY_ATTRIBUTE, "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements l<String, Boolean> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f83401c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(p pVar) {
            super(1);
            this.f83401c = pVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String key) {
            s.k(key, "key");
            return Boolean.valueOf(!this.f83401c.j().contains(key));
        }
    }

    public r(String navigatorName) {
        s.k(navigatorName, "navigatorName");
        this.navigatorName = navigatorName;
        this.deepLinks = new ArrayList();
        this.actions = new y0<>(0, 1, null);
        this._arguments = new LinkedHashMap();
    }

    public static /* synthetic */ int[] j(r rVar, r rVar2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i11 & 1) != 0) {
            rVar2 = null;
        }
        return rVar.i(rVar2);
    }

    private final boolean q(p deepLink, Uri uri, Map<String, h> arguments) {
        return j.a(arguments, new d(deepLink.p(uri, arguments))).isEmpty();
    }

    public final void d(String argumentName, h argument) {
        s.k(argumentName, "argumentName");
        s.k(argument, "argument");
        this._arguments.put(argumentName, argument);
    }

    public final void e(p navDeepLink) {
        s.k(navDeepLink, "navDeepLink");
        List<String> listA = j.a(this._arguments, new c(navDeepLink));
        if (listA.isEmpty()) {
            this.deepLinks.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + listA).toString());
    }

    public boolean equals(Object other) {
        boolean z11;
        boolean z12;
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof r)) {
            r rVar = (r) other;
            boolean zF = s.f(this.deepLinks, rVar.deepLinks);
            if (this.actions.l() != rVar.actions.l()) {
                z11 = false;
                break;
            }
            Iterator it = ho0.l.h(a1.a(this.actions)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = true;
                    break;
                }
                int iIntValue = ((Number) it.next()).intValue();
                if (!s.f(this.actions.e(iIntValue), rVar.actions.e(iIntValue))) {
                    z11 = false;
                    break;
                }
            }
            if (this._arguments.size() != rVar._arguments.size()) {
                z12 = false;
                break;
            }
            Iterator it2 = v0.E(this._arguments).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z12 = true;
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (!rVar._arguments.containsKey(entry.getKey()) || !s.f(rVar._arguments.get(entry.getKey()), entry.getValue())) {
                    z12 = false;
                    break;
                }
            }
            if (this.id == rVar.id && s.f(this.route, rVar.route) && zF && z11 && z12) {
                return true;
            }
        }
        return false;
    }

    public final Bundle h(Bundle args) {
        if (args == null && this._arguments.isEmpty()) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, h> entry : this._arguments.entrySet()) {
            entry.getValue().e(entry.getKey(), bundle);
        }
        if (args != null) {
            bundle.putAll(args);
            for (Map.Entry<String, h> entry2 : this._arguments.entrySet()) {
                String key = entry2.getKey();
                h value = entry2.getValue();
                if (!value.getIsDefaultValueUnknown() && !value.f(key, bundle)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.a().getName() + " expected.").toString());
                }
            }
        }
        return bundle;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i11 = this.id * 31;
        String str = this.route;
        int iHashCode = i11 + (str != null ? str.hashCode() : 0);
        for (p pVar : this.deepLinks) {
            int i12 = iHashCode * 31;
            String strY = pVar.getUriPattern();
            int iHashCode2 = (i12 + (strY != null ? strY.hashCode() : 0)) * 31;
            String strI = pVar.getAction();
            int iHashCode3 = (iHashCode2 + (strI != null ? strI.hashCode() : 0)) * 31;
            String strT = pVar.getMimeType();
            iHashCode = iHashCode3 + (strT != null ? strT.hashCode() : 0);
        }
        Iterator itB = a1.b(this.actions);
        while (itB.hasNext()) {
            g gVar = (g) itB.next();
            int iB = ((iHashCode * 31) + gVar.getDestinationId()) * 31;
            y yVarC = gVar.getNavOptions();
            iHashCode = iB + (yVarC != null ? yVarC.hashCode() : 0);
            Bundle bundleA = gVar.getDefaultArguments();
            if (bundleA != null && (setKeySet = bundleA.keySet()) != null) {
                s.j(setKeySet, "keySet()");
                for (String str2 : setKeySet) {
                    int i13 = iHashCode * 31;
                    Bundle bundleA2 = gVar.getDefaultArguments();
                    s.h(bundleA2);
                    Object obj = bundleA2.get(str2);
                    iHashCode = i13 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : this._arguments.keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str3.hashCode()) * 31;
            h hVar = this._arguments.get(str3);
            iHashCode = iHashCode4 + (hVar != null ? hVar.hashCode() : 0);
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    public final int[] i(r previousDestination) {
        m mVar = new m();
        r rVar = this;
        while (true) {
            s.h(rVar);
            t tVar = rVar.parent;
            if ((previousDestination != null ? previousDestination.parent : null) != null) {
                t tVar2 = previousDestination.parent;
                s.h(tVar2);
                if (tVar2.C(rVar.id) != rVar) {
                    if (tVar != null || tVar.getStartDestId() != rVar.id) {
                        mVar.addFirst(rVar);
                    }
                    if (!s.f(tVar, previousDestination) || tVar == null) {
                        break;
                    }
                    rVar = tVar;
                } else {
                    mVar.addFirst(rVar);
                    break;
                }
            } else {
                if (tVar != null) {
                    mVar.addFirst(rVar);
                } else {
                    mVar.addFirst(rVar);
                }
                if (!s.f(tVar, previousDestination)) {
                    break;
                }
                rVar = tVar;
            }
        }
        List listM1 = v.m1(mVar);
        ArrayList arrayList = new ArrayList(v.y(listM1, 10));
        Iterator it = listM1.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((r) it.next()).id));
        }
        return v.l1(arrayList);
    }

    public final Map<String, h> k() {
        return v0.A(this._arguments);
    }

    public String l() {
        String str = this.idName;
        return str == null ? String.valueOf(this.id) : str;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getNavigatorName() {
        return this.navigatorName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final t getParent() {
        return this.parent;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    public final boolean r(String route, Bundle arguments) {
        s.k(route, "route");
        if (s.f(this.route, route)) {
            return true;
        }
        b bVarT = t(route);
        if (s.f(this, bVarT != null ? bVarT.getDestination() : null)) {
            return bVarT.d(arguments);
        }
        return false;
    }

    public b s(q navDeepLinkRequest) {
        s.k(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        b bVar = null;
        for (p pVar : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            Bundle bundleO = uri != null ? pVar.o(uri, this._arguments) : null;
            int iH = pVar.h(uri);
            String action = navDeepLinkRequest.getAction();
            boolean z11 = action != null && s.f(action, pVar.getAction());
            String mimeType = navDeepLinkRequest.getMimeType();
            int iU = mimeType != null ? pVar.u(mimeType) : -1;
            if (bundleO == null) {
                if (z11 || iU > -1) {
                    if (q(pVar, uri, this._arguments)) {
                    }
                }
            }
            b bVar2 = new b(this, bundleO, pVar.getIsExactDeepLink(), iH, z11, iU);
            if (bVar == null || bVar2.compareTo(bVar) > 0) {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    public final b t(String route) {
        p value;
        s.k(route, "route");
        Lazy<p> lazy = this.routeDeepLink;
        if (lazy == null || (value = lazy.getValue()) == null) {
            return null;
        }
        Uri uri = Uri.parse(INSTANCE.a(route));
        s.g(uri, "Uri.parse(this)");
        Bundle bundleO = value.o(uri, this._arguments);
        if (bundleO == null) {
            return null;
        }
        return new b(this, bundleO, value.getIsExactDeepLink(), value.h(uri), false, -1);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.idName;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.id));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.route;
        if (str2 != null && !t.y0(str2)) {
            sb2.append(" route=");
            sb2.append(this.route);
        }
        if (this.label != null) {
            sb2.append(" label=");
            sb2.append(this.label);
        }
        String string = sb2.toString();
        s.j(string, "sb.toString()");
        return string;
    }

    public final void u(int actionId, g action) {
        s.k(action, "action");
        if (z()) {
            if (actionId == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.actions.i(actionId, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + actionId + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void v(int i11) {
        this.id = i11;
        this.idName = null;
    }

    public final void w(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void x(t tVar) {
        this.parent = tVar;
    }

    public final void y(String str) {
        if (str == null) {
            v(0);
        } else {
            if (t.y0(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            String strA = INSTANCE.a(str);
            List<String> listA = j.a(this._arguments, new f(new p.a().b(strA).a()));
            if (!listA.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + listA).toString());
            }
            this.routeDeepLink = jn0.m.b(new e(strA));
            v(strA.hashCode());
        }
        this.route = str;
    }

    public boolean z() {
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(d0<? extends r> navigator) {
        this(e0.INSTANCE.a(navigator.getClass()));
        s.k(navigator, "navigator");
    }
}
