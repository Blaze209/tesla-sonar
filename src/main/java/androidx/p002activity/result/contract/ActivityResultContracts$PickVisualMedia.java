package androidx.p002activity.result.contract;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0016\u0018\u0000 \u00142\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0007\n\r\u0012\u0014\u0015\u0016\u0017B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"androidx/activity/result/contract/ActivityResultContracts$PickVisualMedia", "Landroidx/activity/result/contract/ActivityResultContract;", "Lh/f;", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lh/f;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$a;", "b", "(Landroid/content/Context;Lh/f;)Landroidx/activity/result/contract/ActivityResultContract$a;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "c", "(ILandroid/content/Intent;)Landroid/net/Uri;", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ActivityResultContracts$PickVisualMedia extends ActivityResultContract<h.f, Uri> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$a;", "", "<init>", "()V", "", DateTokenConverter.CONVERTER_KEY, "()Z", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "c", "(Landroid/content/Context;)Z", "Landroid/content/pm/ResolveInfo;", "a", "(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;", "input", "", "b", "(Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;)Ljava/lang/String;", "GMS_ACTION_PICK_IMAGES", "Ljava/lang/String;", "GMS_EXTRA_PICK_IMAGES_MAX", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ResolveInfo a(Context context) {
            s.k(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public final String b(g input) {
            s.k(input, "input");
            if (input instanceof d) {
                return "image/*";
            }
            if (input instanceof f) {
                return "video/*";
            }
            if (input instanceof e) {
                return ((e) input).a();
            }
            if (input instanceof c) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }

        public final boolean c(Context context) {
            s.k(context, "context");
            return a(context) != null;
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public final boolean d() {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 33) {
                return true;
            }
            return i11 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0005\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b;", "", "<init>", "()V", "", "a", "()I", "value", "b", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b$a;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b;", "<init>", "()V", "", "b", "I", "a", "()I", "value", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f1950a = new a();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final int value = 0;

            private a() {
                super(null);
            }

            @Override // androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia.b
            public int a() {
                return value;
            }
        }

        /* JADX INFO: renamed from: androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b$b;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$b;", "<init>", "()V", "", "b", "I", "a", "()I", "value", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class C0058b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0058b f1952a = new C0058b();

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private static final int value = 1;

            private C0058b() {
                super(null);
            }

            @Override // androidx.activity.result.contract.ActivityResultContracts$PickVisualMedia.b
            public int a() {
                return value;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int a();

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$c;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f1954a = new c();

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$d;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f1955a = new d();

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$e;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;", "", "mimeType", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements g {
        public final String a() {
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$f;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f1956a = new f();

        private f() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$g;", "", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$c;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$d;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$e;", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$f;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface g {
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, h.f input) {
        s.k(context, "context");
        s.k(input, "input");
        Companion companion = INSTANCE;
        if (companion.d()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(companion.b(input.getMediaType()));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().a());
            if (input.getIsCustomAccentColorApplied()) {
                intent.putExtra("android.provider.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
            }
            return intent;
        }
        if (!companion.c(context)) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(companion.b(input.getMediaType()));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoA = companion.a(context);
        if (resolveInfoA == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoA.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(companion.b(input.getMediaType()));
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.getDefaultTab().a());
        if (input.getIsCustomAccentColorApplied()) {
            intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_ACCENT_COLOR", input.getAccentColor());
        }
        return intent3;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityResultContract.a<Uri> getSynchronousResult(Context context, h.f input) {
        s.k(context, "context");
        s.k(input, "input");
        return null;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Uri parseResult(int resultCode, Intent intent) {
        if (resultCode != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        return data == null ? (Uri) v.q0(ActivityResultContracts$GetMultipleContents.INSTANCE.a(intent)) : data;
    }
}
