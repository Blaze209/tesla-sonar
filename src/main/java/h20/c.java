package h20;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.HashMap;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lh20/c;", "Lo20/c;", "<init>", "()V", "", "f", "()Ljava/lang/String;", "schema", "", "", "b", "()Ljava/util/Map;", "dataPayload", DateTokenConverter.CONVERTER_KEY, "a", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends o20.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f70411e = c.class.getSimpleName();

    /* JADX INFO: renamed from: h20.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000bR\u001c\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lh20/c$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "c", "(Landroid/content/Context;)Z", "Ljn0/h0;", "e", "(Landroid/content/Context;)V", DateTokenConverter.CONVERTER_KEY, "f", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: h20.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh20/f;", "referrer", "Ljn0/h0;", "a", "(Lh20/f;)V"}, k = 3, mv = {1, 8, 0})
        static final class C1459a extends u implements wn0.l<f, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c f70412c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Context f70413d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1459a(c cVar, Context context) {
                super(1);
                this.f70412c = cVar;
                this.f70413d = context;
            }

            public final void a(f fVar) {
                if (fVar != null) {
                    this.f70412c.getEntities().add(fVar);
                }
                HashMap map = new HashMap();
                map.put("event", this.f70412c);
                i20.b.b("SnowplowInstallTracking", map);
                c.INSTANCE.d(this.f70413d);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(f fVar) {
                a(fVar);
                return h0.f84049a;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean c(Context context) {
            return ma.b.a(context).getString("installed_before", null) == null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(Context context) {
            SharedPreferences.Editor editorEdit = ma.b.a(context).edit();
            if (editorEdit != null) {
                editorEdit.putString("installed_before", "YES");
            }
            if (editorEdit != null) {
                editorEdit.apply();
            }
        }

        private final void e(Context context) {
            f.INSTANCE.a(context, new C1459a(new c(), context));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(Context context) {
            s.k(context, "$context");
            Companion companion = c.INSTANCE;
            if (companion.c(context)) {
                companion.e(context);
            }
        }

        public final void f(final Context context) {
            s.k(context, "context");
            z10.g.d(c.f70411e, new Runnable() { // from class: h20.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.Companion.g(context);
                }
            });
        }

        private Companion() {
        }
    }

    @Override // o20.f
    public Map<String, Object> b() {
        return v0.i();
    }

    @Override // o20.c
    /* JADX INFO: renamed from: f */
    public String getSchema() {
        return "iglu:com.snowplowanalytics.mobile/application_install/jsonschema/1-0-0";
    }
}
