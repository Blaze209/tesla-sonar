package expo.modules.constants;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import bq0.c;
import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.interfaces.constants.ConstantsInterface;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import jn0.x;
import on0.a;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import sn0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0016\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00110\u0010H\u0016J\u0016\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lexpo/modules/constants/ConstantsService;", "Lexpo/modules/core/interfaces/InternalModule;", "Lexpo/modules/interfaces/constants/ConstantsInterface;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "statusBarHeightInternal", "", "getStatusBarHeightInternal", "()I", "setStatusBarHeightInternal", "(I)V", "sessionId", "", "getExportedInterfaces", "", "Ljava/lang/Class;", "getConstants", "", "", "getAppScopeKey", "getDeviceName", "getStatusBarHeight", "getSystemVersion", "getSystemFonts", "appConfig", "getAppConfig", "()Ljava/lang/String;", "ExecutionEnvironment", "Companion", "expo-constants_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ConstantsService implements InternalModule, ConstantsInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context context;
    private final String sessionId;
    private int statusBarHeightInternal;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lexpo/modules/constants/ConstantsService$Companion;", "", "<init>", "()V", "convertPixelsToDp", "", "px", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "expo-constants_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int convertPixelsToDp(float px2, Context context) {
            return (int) (px2 / (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/constants/ConstantsService$ExecutionEnvironment;", "", InquiryField.StringField.TYPE, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getString", "()Ljava/lang/String;", "BARE", "STANDALONE", "STORE_CLIENT", "expo-constants_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum ExecutionEnvironment {
        BARE("bare"),
        STANDALONE("standalone"),
        STORE_CLIENT("storeClient");

        private static final /* synthetic */ EnumEntries $ENTRIES = a.a(values());
        private final String string;

        ExecutionEnvironment(String str) {
            this.string = str;
        }

        public static EnumEntries<ExecutionEnvironment> getEntries() {
            return $ENTRIES;
        }

        public final String getString() {
            return this.string;
        }
    }

    public ConstantsService(Context context) {
        s.k(context, "context");
        this.context = context;
        Integer numValueOf = Integer.valueOf(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        numValueOf = numValueOf.intValue() <= 0 ? null : numValueOf;
        this.statusBarHeightInternal = numValueOf != null ? INSTANCE.convertPixelsToDp(context.getResources().getDimensionPixelSize(numValueOf.intValue()), context) : 0;
        String string = UUID.randomUUID().toString();
        s.j(string, "toString(...)");
        this.sessionId = string;
    }

    private final String getAppConfig() {
        try {
            InputStream inputStreamOpen = this.context.getAssets().open("app.config");
            try {
                String strJ = c.j(inputStreamOpen, StandardCharsets.UTF_8);
                b.a(inputStreamOpen, null);
                return strJ;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(inputStreamOpen, th2);
                    throw th3;
                }
            }
        } catch (FileNotFoundException unused) {
            return null;
        } catch (Exception e11) {
            Log.e(ConstantsServiceKt.TAG, "Error reading embedded app config", e11);
            return null;
        }
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public String getAppScopeKey() {
        return this.context.getPackageName();
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public Map<String, Object> getConstants() {
        return v0.o(x.a("sessionId", this.sessionId), x.a("executionEnvironment", ExecutionEnvironment.BARE.getString()), x.a("statusBarHeight", Integer.valueOf(this.statusBarHeightInternal)), x.a("deviceName", getDeviceName()), x.a("systemFonts", getSystemFonts()), x.a("systemVersion", getSystemVersion()), x.a("manifest", getAppConfig()), x.a("platform", v0.f(x.a("android", v0.i()))));
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public String getDeviceName() {
        String MODEL = Build.MODEL;
        s.j(MODEL, "MODEL");
        return MODEL;
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<Class<?>> getExportedInterfaces() {
        return v.e(ConstantsInterface.class);
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    /* JADX INFO: renamed from: getStatusBarHeight, reason: from getter */
    public int getStatusBarHeightInternal() {
        return this.statusBarHeightInternal;
    }

    public final int getStatusBarHeightInternal() {
        return this.statusBarHeightInternal;
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public List<String> getSystemFonts() {
        return v.p("normal", "notoserif", "sans-serif", "sans-serif-light", "sans-serif-thin", "sans-serif-condensed", "sans-serif-medium", "serif", "Roboto", "monospace");
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public String getSystemVersion() {
        String RELEASE = Build.VERSION.RELEASE;
        s.j(RELEASE, "RELEASE");
        return RELEASE;
    }

    public final void setStatusBarHeightInternal(int i11) {
        this.statusBarHeightInternal = i11;
    }
}
