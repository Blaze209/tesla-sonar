package androidx.p002activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.p002activity.result.ActivityResultRegistry;
import androidx.p002activity.result.contract.ActivityResultContract;
import androidx.p003lifecycle.Lifecycle;
import androidx.p003lifecycle.LifecycleOwner;
import androidx.p003lifecycle.u;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import ezvcard.property.Gender;
import ho0.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b&\u0018\u0000 \u00122\u00020\u0001:\u00037:=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JI\u0010\u001e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u001b\u001a\u00028\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJQ\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b%\u0010&JI\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$\"\u0004\b\u0000\u0010\u0017\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00192\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b)\u0010\u0011J\u0015\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010*¢\u0006\u0004\b/\u0010-J)\u00101\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b1\u00102J%\u00104\u001a\u000200\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u00103\u001a\u00028\u0000H\u0007¢\u0006\u0004\b4\u00105R \u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00108R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020<068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00108R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010@R$\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00108R\"\u0010C\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00108R\u0014\u0010E\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010D¨\u0006F"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry;", "", "<init>", "()V", Gender.OTHER, "", Action.KEY_ATTRIBUTE, "", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", "data", "Landroidx/activity/result/ActivityResultRegistry$a;", "callbackAndContract", "Ljn0/h0;", "g", "(Ljava/lang/String;ILandroid/content/Intent;Landroidx/activity/result/ActivityResultRegistry$a;)V", "o", "(Ljava/lang/String;)V", "h", "()I", "rc", DateTokenConverter.CONVERTER_KEY, "(ILjava/lang/String;)V", "I", "requestCode", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/core/app/d;", "options", IntegerTokenConverter.CONVERTER_KEY, "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/d;)V", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/ActivityResultLauncher;", "m", "(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "l", "(Ljava/lang/String;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;", "p", "Landroid/os/Bundle;", "outState", "k", "(Landroid/os/Bundle;)V", "savedInstanceState", "j", "", "e", "(IILandroid/content/Intent;)Z", "result", "f", "(ILjava/lang/Object;)Z", "", "a", "Ljava/util/Map;", "rcToKey", "b", "keyToRc", "Landroidx/activity/result/ActivityResultRegistry$c;", "c", "keyToLifecycleContainers", "", "Ljava/util/List;", "launchedKeys", "keyToCallback", "parsedPendingResults", "Landroid/os/Bundle;", "pendingResults", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f1925h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, String> rcToKey = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Integer> keyToRc = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, c> keyToLifecycleContainers = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> launchedKeys = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final transient Map<String, a<?>> keyToCallback = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> parsedPendingResults = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Bundle pendingResults = new Bundle();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR!\u0010\u0006\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$a;", Gender.OTHER, "", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "<init>", "(Landroidx/activity/result/ActivityResultCallback;Landroidx/activity/result/contract/ActivityResultContract;)V", "a", "Landroidx/activity/result/ActivityResultCallback;", "()Landroidx/activity/result/ActivityResultCallback;", "b", "Landroidx/activity/result/contract/ActivityResultContract;", "()Landroidx/activity/result/contract/ActivityResultContract;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ActivityResultCallback<O> callback;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ActivityResultContract<?, O> contract;

        public a(ActivityResultCallback<O> callback, ActivityResultContract<?, O> contract) {
            s.k(callback, "callback");
            s.k(contract, "contract");
            this.callback = callback;
            this.contract = contract;
        }

        public final ActivityResultCallback<O> a() {
            return this.callback;
        }

        public final ActivityResultContract<?, O> b() {
            return this.contract;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$b;", "", "<init>", "()V", "", "INITIAL_REQUEST_CODE_VALUE", "I", "", "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", "Ljava/lang/String;", "KEY_COMPONENT_ACTIVITY_PENDING_RESULTS", "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", "LOG_TAG", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/activity/result/ActivityResultRegistry$c;", "", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "<init>", "(Landroidx/lifecycle/Lifecycle;)V", "Landroidx/lifecycle/u;", "observer", "Ljn0/h0;", "a", "(Landroidx/lifecycle/u;)V", "b", "()V", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "", "Ljava/util/List;", "observers", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Lifecycle lifecycle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<u> observers;

        public c(Lifecycle lifecycle) {
            s.k(lifecycle, "lifecycle");
            this.lifecycle = lifecycle;
            this.observers = new ArrayList();
        }

        public final void a(u observer) {
            s.k(observer, "observer");
            this.lifecycle.a(observer);
            this.observers.add(observer);
        }

        public final void b() {
            Iterator<T> it = this.observers.iterator();
            while (it.hasNext()) {
                this.lifecycle.d((u) it.next());
            }
            this.observers.clear();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<Integer> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f1937c = new d();

        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(zn0.c.INSTANCE.d(2147418112) + 65536);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\r\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/activity/result/ActivityResultRegistry$e", "Landroidx/activity/result/ActivityResultLauncher;", "input", "Landroidx/core/app/d;", "options", "Ljn0/h0;", "c", "(Ljava/lang/Object;Landroidx/core/app/d;)V", DateTokenConverter.CONVERTER_KEY, "()V", "Landroidx/activity/result/contract/ActivityResultContract;", "a", "()Landroidx/activity/result/contract/ActivityResultContract;", "contract", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e<I> extends ActivityResultLauncher<I> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ActivityResultContract<I, O> f1940c;

        e(String str, ActivityResultContract<I, O> activityResultContract) {
            this.f1939b = str;
            this.f1940c = activityResultContract;
        }

        @Override // androidx.p002activity.result.ActivityResultLauncher
        public ActivityResultContract<I, ?> a() {
            return (ActivityResultContract<I, ?>) this.f1940c;
        }

        @Override // androidx.p002activity.result.ActivityResultLauncher
        public void c(I input, androidx.core.app.d options) throws Exception {
            Object obj = ActivityResultRegistry.this.keyToRc.get(this.f1939b);
            Object obj2 = this.f1940c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                ActivityResultRegistry.this.launchedKeys.add(this.f1939b);
                try {
                    ActivityResultRegistry.this.i(iIntValue, this.f1940c, input, options);
                    return;
                } catch (Exception e11) {
                    ActivityResultRegistry.this.launchedKeys.remove(this.f1939b);
                    throw e11;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // androidx.p002activity.result.ActivityResultLauncher
        public void d() {
            ActivityResultRegistry.this.p(this.f1939b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001e\u0010\r\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"androidx/activity/result/ActivityResultRegistry$f", "Landroidx/activity/result/ActivityResultLauncher;", "input", "Landroidx/core/app/d;", "options", "Ljn0/h0;", "c", "(Ljava/lang/Object;Landroidx/core/app/d;)V", DateTokenConverter.CONVERTER_KEY, "()V", "Landroidx/activity/result/contract/ActivityResultContract;", "a", "()Landroidx/activity/result/contract/ActivityResultContract;", "contract", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class f<I> extends ActivityResultLauncher<I> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f1942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ActivityResultContract<I, O> f1943c;

        f(String str, ActivityResultContract<I, O> activityResultContract) {
            this.f1942b = str;
            this.f1943c = activityResultContract;
        }

        @Override // androidx.p002activity.result.ActivityResultLauncher
        public ActivityResultContract<I, ?> a() {
            return (ActivityResultContract<I, ?>) this.f1943c;
        }

        @Override // androidx.p002activity.result.ActivityResultLauncher
        public void c(I input, androidx.core.app.d options) throws Exception {
            Object obj = ActivityResultRegistry.this.keyToRc.get(this.f1942b);
            Object obj2 = this.f1943c;
            if (obj != null) {
                int iIntValue = ((Number) obj).intValue();
                ActivityResultRegistry.this.launchedKeys.add(this.f1942b);
                try {
                    ActivityResultRegistry.this.i(iIntValue, this.f1943c, input, options);
                    return;
                } catch (Exception e11) {
                    ActivityResultRegistry.this.launchedKeys.remove(this.f1942b);
                    throw e11;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + obj2 + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // androidx.p002activity.result.ActivityResultLauncher
        public void d() {
            ActivityResultRegistry.this.p(this.f1942b);
        }
    }

    private final void d(int rc2, String key) {
        this.rcToKey.put(Integer.valueOf(rc2), key);
        this.keyToRc.put(key, Integer.valueOf(rc2));
    }

    private final <O> void g(String key, int resultCode, Intent data, a<O> callbackAndContract) {
        if ((callbackAndContract != null ? callbackAndContract.a() : null) == null || !this.launchedKeys.contains(key)) {
            this.parsedPendingResults.remove(key);
            this.pendingResults.putParcelable(key, new h.a(resultCode, data));
        } else {
            callbackAndContract.a().onActivityResult(callbackAndContract.b().parseResult(resultCode, data));
            this.launchedKeys.remove(key);
        }
    }

    private final int h() {
        for (Number number : l.r(d.f1937c)) {
            if (!this.rcToKey.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(ActivityResultRegistry activityResultRegistry, String str, ActivityResultCallback activityResultCallback, ActivityResultContract activityResultContract, LifecycleOwner lifecycleOwner, Lifecycle.a event) {
        s.k(lifecycleOwner, "<anonymous parameter 0>");
        s.k(event, "event");
        if (Lifecycle.a.ON_START != event) {
            if (Lifecycle.a.ON_STOP == event) {
                activityResultRegistry.keyToCallback.remove(str);
                return;
            } else {
                if (Lifecycle.a.ON_DESTROY == event) {
                    activityResultRegistry.p(str);
                    return;
                }
                return;
            }
        }
        activityResultRegistry.keyToCallback.put(str, new a<>(activityResultCallback, activityResultContract));
        if (activityResultRegistry.parsedPendingResults.containsKey(str)) {
            Object obj = activityResultRegistry.parsedPendingResults.get(str);
            activityResultRegistry.parsedPendingResults.remove(str);
            activityResultCallback.onActivityResult(obj);
        }
        h.a aVar = (h.a) q5.c.a(activityResultRegistry.pendingResults, str, h.a.class);
        if (aVar != null) {
            activityResultRegistry.pendingResults.remove(str);
            activityResultCallback.onActivityResult(activityResultContract.parseResult(aVar.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.RESULT_CODE java.lang.String(), aVar.getData()));
        }
    }

    private final void o(String key) {
        if (this.keyToRc.get(key) != null) {
            return;
        }
        d(h(), key);
    }

    public final boolean e(int requestCode, int resultCode, Intent data) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        g(str, resultCode, data, this.keyToCallback.get(str));
        return true;
    }

    public final <O> boolean f(int requestCode, O result) {
        String str = this.rcToKey.get(Integer.valueOf(requestCode));
        if (str == null) {
            return false;
        }
        a<?> aVar = this.keyToCallback.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.pendingResults.remove(str);
            this.parsedPendingResults.put(str, result);
            return true;
        }
        ActivityResultCallback<?> activityResultCallbackA = aVar.a();
        s.i(activityResultCallbackA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.launchedKeys.remove(str)) {
            return true;
        }
        activityResultCallbackA.onActivityResult(result);
        return true;
    }

    public abstract <I, O> void i(int requestCode, ActivityResultContract<I, O> contract, I input, androidx.core.app.d options);

    public final void j(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = savedInstanceState.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = savedInstanceState.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.launchedKeys.addAll(stringArrayList2);
        }
        Bundle bundle = savedInstanceState.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle != null) {
            this.pendingResults.putAll(bundle);
        }
        int size = stringArrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            String str = stringArrayList.get(i11);
            if (this.keyToRc.containsKey(str)) {
                Integer numRemove = this.keyToRc.remove(str);
                if (!this.pendingResults.containsKey(str)) {
                    u0.d(this.rcToKey).remove(numRemove);
                }
            }
            Integer num = integerArrayList.get(i11);
            s.j(num, "rcs[i]");
            int iIntValue = num.intValue();
            String str2 = stringArrayList.get(i11);
            s.j(str2, "keys[i]");
            d(iIntValue, str2);
        }
    }

    public final void k(Bundle outState) {
        s.k(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.keyToRc.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.keyToRc.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.launchedKeys));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.pendingResults));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <I, O> ActivityResultLauncher<I> l(String key, ActivityResultContract<I, O> contract, ActivityResultCallback<O> callback) {
        s.k(key, "key");
        s.k(contract, "contract");
        s.k(callback, "callback");
        o(key);
        this.keyToCallback.put(key, new a<>(callback, contract));
        if (this.parsedPendingResults.containsKey(key)) {
            Object obj = this.parsedPendingResults.get(key);
            this.parsedPendingResults.remove(key);
            callback.onActivityResult(obj);
        }
        h.a aVar = (h.a) q5.c.a(this.pendingResults, key, h.a.class);
        if (aVar != null) {
            this.pendingResults.remove(key);
            callback.onActivityResult(contract.parseResult(aVar.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.RESULT_CODE java.lang.String(), aVar.getData()));
        }
        return new f(key, contract);
    }

    public final <I, O> ActivityResultLauncher<I> m(final String key, LifecycleOwner lifecycleOwner, final ActivityResultContract<I, O> contract, final ActivityResultCallback<O> callback) {
        s.k(key, "key");
        s.k(lifecycleOwner, "lifecycleOwner");
        s.k(contract, "contract");
        s.k(callback, "callback");
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getState().isAtLeast(Lifecycle.State.STARTED)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(key);
        c cVar = this.keyToLifecycleContainers.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new u() { // from class: h.c
            @Override // androidx.p003lifecycle.u
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.a aVar) {
                ActivityResultRegistry.n(this.f70049a, key, callback, contract, lifecycleOwner2, aVar);
            }
        });
        this.keyToLifecycleContainers.put(key, cVar);
        return new e(key, contract);
    }

    public final void p(String key) {
        Integer numRemove;
        s.k(key, "key");
        if (!this.launchedKeys.contains(key) && (numRemove = this.keyToRc.remove(key)) != null) {
            this.rcToKey.remove(numRemove);
        }
        this.keyToCallback.remove(key);
        if (this.parsedPendingResults.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.parsedPendingResults.get(key));
            this.parsedPendingResults.remove(key);
        }
        if (this.pendingResults.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((h.a) q5.c.a(this.pendingResults, key, h.a.class)));
            this.pendingResults.remove(key);
        }
        c cVar = this.keyToLifecycleContainers.get(key);
        if (cVar != null) {
            cVar.b();
            this.keyToLifecycleContainers.remove(key);
        }
    }
}
