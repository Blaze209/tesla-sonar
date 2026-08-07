package expo.modules.mailcomposer;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co0.q;
import eb.a;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.OnActivityResultPayload;
import expo.modules.kotlin.exception.Exceptions;
import expo.modules.kotlin.functions.AsyncFunctionComponent;
import expo.modules.kotlin.functions.AsyncFunctionWithPromiseComponent;
import expo.modules.kotlin.functions.BoolAsyncFunctionComponent;
import expo.modules.kotlin.functions.DoubleAsyncFunctionComponent;
import expo.modules.kotlin.functions.FloatAsyncFunctionComponent;
import expo.modules.kotlin.functions.IntAsyncFunctionComponent;
import expo.modules.kotlin.functions.StringAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.functions.UntypedAsyncFunctionComponent;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.modules.ModuleDefinitionBuilder;
import expo.modules.kotlin.modules.ModuleDefinitionData;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.ReturnType;
import expo.modules.kotlin.types.ReturnTypeProvider;
import expo.modules.kotlin.types.TypeConverterProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lexpo/modules/mailcomposer/MailComposerModule;", "Lexpo/modules/kotlin/modules/Module;", "<init>", "()V", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "composerOpened", "", "pendingPromise", "Lexpo/modules/kotlin/Promise;", "definition", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "getAvailableMailClients", "", "Lexpo/modules/mailcomposer/MailClient;", "Companion", "expo-mail-composer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MailComposerModule extends Module {
    private static final String MAILTO_URI = "mailto:";
    private static final int REQUEST_CODE = 8675;
    private boolean composerOpened;
    private Promise pendingPromise;

    /* JADX INFO: Access modifiers changed from: private */
    public final List<MailClient> getAvailableMailClients() throws PackageManager.NameNotFoundException {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse(MAILTO_URI));
        PackageManager packageManager = getContext().getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        s.j(listQueryIntentActivities, "queryIntentActivities(...)");
        List<ResolveInfo> list = listQueryIntentActivities;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            String str = ((ResolveInfo) it.next()).activityInfo.packageName;
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            s.j(applicationInfo, "getApplicationInfo(...)");
            String string = packageManager.getApplicationLabel(applicationInfo).toString();
            s.h(str);
            arrayList.add(new MailClient(string, str));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() throws Exceptions.ReactContextLost {
        Context reactContext = getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new Exceptions.ReactContextLost();
    }

    @Override // expo.modules.kotlin.modules.Module
    public ModuleDefinitionData definition() {
        AsyncFunctionComponent stringAsyncFunctionComponent;
        a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            ModuleDefinitionBuilder moduleDefinitionBuilder = new ModuleDefinitionBuilder(this);
            moduleDefinitionBuilder.Name("ExpoMailComposer");
            AnyType[] anyTypeArr = new AnyType[0];
            l<Object[], Boolean> lVar = new l<Object[], Boolean>() { // from class: expo.modules.mailcomposer.MailComposerModule$definition$lambda$9$$inlined$AsyncFunction$1
                @Override // wn0.l
                public final Boolean invoke(Object[] it) throws ResolveActivityException {
                    s.k(it, "it");
                    try {
                        Intent intent = new Intent("android.intent.action.SENDTO");
                        intent.setData(Uri.parse("mailto:"));
                        PackageManager packageManager = this.this$0.getContext().getPackageManager();
                        return Boolean.valueOf((packageManager == null || intent.resolveActivity(packageManager) == null) ? false : true);
                    } catch (Exception e11) {
                        throw new ResolveActivityException(e11);
                    }
                }
            };
            if (s.f(Boolean.class, Integer.TYPE)) {
                stringAsyncFunctionComponent = new IntAsyncFunctionComponent("isAvailableAsync", anyTypeArr, lVar);
            } else if (s.f(Boolean.class, Boolean.TYPE)) {
                stringAsyncFunctionComponent = new BoolAsyncFunctionComponent("isAvailableAsync", anyTypeArr, lVar);
            } else if (s.f(Boolean.class, Double.TYPE)) {
                stringAsyncFunctionComponent = new DoubleAsyncFunctionComponent("isAvailableAsync", anyTypeArr, lVar);
            } else if (s.f(Boolean.class, Float.TYPE)) {
                stringAsyncFunctionComponent = new FloatAsyncFunctionComponent("isAvailableAsync", anyTypeArr, lVar);
            } else {
                stringAsyncFunctionComponent = s.f(Boolean.class, String.class) ? new StringAsyncFunctionComponent("isAvailableAsync", anyTypeArr, lVar) : new UntypedAsyncFunctionComponent("isAvailableAsync", anyTypeArr, lVar);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("isAvailableAsync", stringAsyncFunctionComponent);
            AnyType[] anyTypeArr2 = new AnyType[0];
            ReturnTypeProvider returnTypeProvider = ReturnTypeProvider.INSTANCE;
            ReturnType returnType = returnTypeProvider.getTypes().get(o0.b(Object.class));
            if (returnType == null) {
                returnType = new ReturnType(o0.b(Object.class));
                returnTypeProvider.getTypes().put(o0.b(Object.class), returnType);
            }
            moduleDefinitionBuilder.getSyncFunctions().put("getClients", new SyncFunctionComponent("getClients", anyTypeArr2, returnType, new l<Object[], Object>() { // from class: expo.modules.mailcomposer.MailComposerModule$definition$lambda$9$$inlined$FunctionWithoutArgs$1
                @Override // wn0.l
                public final Object invoke(Object[] it) {
                    s.k(it, "it");
                    return this.this$0.getAvailableMailClients();
                }
            }));
            TypeConverterProvider converters = moduleDefinitionBuilder.getConverters();
            AnyType anyType = AnyTypeProvider.INSTANCE.getTypesMap().get(new Pair(o0.b(MailComposerOptions.class), Boolean.FALSE));
            if (anyType == null) {
                anyType = new AnyType(new LazyKType(o0.b(MailComposerOptions.class), false, new wn0.a<q>() { // from class: expo.modules.mailcomposer.MailComposerModule$definition$lambda$9$$inlined$AsyncFunctionWithPromise$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // wn0.a
                    public final q invoke() {
                        return o0.o(MailComposerOptions.class);
                    }
                }), converters);
            }
            moduleDefinitionBuilder.getAsyncFunctions().put("composeAsync", new AsyncFunctionWithPromiseComponent("composeAsync", new AnyType[]{anyType}, new p<Object[], Promise, h0>() { // from class: expo.modules.mailcomposer.MailComposerModule$definition$lambda$9$$inlined$AsyncFunctionWithPromise$2
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Object[] objArr, Promise promise) {
                    s.k(objArr, "<destruct>");
                    s.k(promise, "promise");
                    MailComposerOptions mailComposerOptions = (MailComposerOptions) objArr[0];
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    Application application = this.this$0.getAppContext().getThrowingActivity().getApplication();
                    List<ResolveInfo> listQueryIntentActivities = this.this$0.getContext().getPackageManager().queryIntentActivities(intent, 0);
                    s.j(listQueryIntentActivities, "queryIntentActivities(...)");
                    List<ResolveInfo> list = listQueryIntentActivities;
                    ArrayList arrayList = new ArrayList(v.y(list, 10));
                    for (ResolveInfo resolveInfo : list) {
                        MailIntentBuilder mailIntentBuilder = new MailIntentBuilder(mailComposerOptions);
                        String packageName = resolveInfo.activityInfo.packageName;
                        s.j(packageName, "packageName");
                        String name = resolveInfo.activityInfo.name;
                        s.j(name, "name");
                        MailIntentBuilder mailIntentBuilderPutBody = mailIntentBuilder.setComponentName(packageName, name).putRecipients("android.intent.extra.EMAIL").putCcRecipients("android.intent.extra.CC").putBccRecipients("android.intent.extra.BCC").putSubject("android.intent.extra.SUBJECT").putBody("android.intent.extra.TEXT", s.f(mailComposerOptions.isHtml(), Boolean.TRUE));
                        s.h(application);
                        arrayList.add(mailIntentBuilderPutBody.putAttachments("android.intent.extra.STREAM", application).getMailIntent());
                    }
                    List listP1 = v.p1(arrayList);
                    Intent intentCreateChooser = Intent.createChooser((Intent) listP1.remove(listP1.size() - 1), null);
                    intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) listP1.toArray(new Intent[0]));
                    intentCreateChooser.addFlags(1);
                    this.this$0.pendingPromise = promise;
                    this.this$0.getAppContext().getThrowingActivity().startActivityForResult(intentCreateChooser, 8675);
                    this.this$0.composerOpened = true;
                }

                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Object[] objArr, Promise promise) {
                    invoke2(objArr, promise);
                    return h0.f84049a;
                }
            }));
            Map<EventName, EventListener> eventListeners = moduleDefinitionBuilder.getEventListeners();
            EventName eventName = EventName.ON_ACTIVITY_RESULT;
            eventListeners.put(eventName, new EventListenerWithSenderAndPayload(eventName, new p<Activity, OnActivityResultPayload, h0>() { // from class: expo.modules.mailcomposer.MailComposerModule$definition$lambda$9$$inlined$OnActivityResult$1
                @Override // wn0.p
                public /* bridge */ /* synthetic */ h0 invoke(Activity activity, OnActivityResultPayload onActivityResultPayload) {
                    invoke2(activity, onActivityResultPayload);
                    return h0.f84049a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Activity sender, OnActivityResultPayload payload) {
                    Promise promise;
                    s.k(sender, "sender");
                    s.k(payload, "payload");
                    if (payload.getRequestCode() != 8675 || this.this$0.pendingPromise == null || (promise = this.this$0.pendingPromise) == null || !this.this$0.composerOpened) {
                        return;
                    }
                    this.this$0.composerOpened = false;
                    Bundle bundle = new Bundle();
                    bundle.putString(PermissionsResponse.STATUS_KEY, "sent");
                    promise.resolve(bundle);
                }
            }));
            return moduleDefinitionBuilder.buildModule();
        } finally {
            a.f();
        }
    }
}
