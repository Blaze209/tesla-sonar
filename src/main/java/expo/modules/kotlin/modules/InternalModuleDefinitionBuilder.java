package expo.modules.kotlin.modules;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import co0.d;
import co0.q;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.activityresult.AppContextActivityResultCaller;
import expo.modules.kotlin.classcomponent.ClassComponentBuilder;
import expo.modules.kotlin.classcomponent.ClassDefinitionData;
import expo.modules.kotlin.events.BasicEventListener;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventListenerWithPayload;
import expo.modules.kotlin.events.EventListenerWithSenderAndPayload;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.OnActivityResultPayload;
import expo.modules.kotlin.objects.ObjectDefinitionBuilder;
import expo.modules.kotlin.sharedobjects.SharedObject;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import expo.modules.kotlin.types.TypeConverterProviderKt;
import expo.modules.kotlin.views.ViewDefinitionBuilder;
import expo.modules.kotlin.views.ViewManagerDefinition;
import expo.modules.kotlin.views.decorators.CSSPropsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.s;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013JG\u0010\u001b\u001a\u00020\r\"\n\b\u0000\u0010\u0015\u0018\u0001*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0018\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u0004\u0012\u00020\r0\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\r2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010$\u001a\u00020\r2\"\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\"\u0012\u0006\u0012\u0004\u0018\u00010#0 ¢\u0006\u0004\b$\u0010%J#\u0010&\u001a\u00020\r2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b&\u0010\u001fJ#\u0010'\u001a\u00020\r2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b'\u0010\u001fJ#\u0010(\u001a\u00020\r2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b(\u0010\u001fJ#\u0010)\u001a\u00020\r2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b)\u0010\u001fJ#\u0010*\u001a\u00020\r2\u000e\b\u0004\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0086\bø\u0001\u0000¢\u0006\u0004\b*\u0010\u001fJ)\u0010,\u001a\u00020\r2\u0014\b\u0004\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\r0\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b,\u0010-J/\u00100\u001a\u00020\r2\u001a\b\u0004\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\r0 H\u0086\bø\u0001\u0000¢\u0006\u0004\b0\u0010%J7\u00102\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u001a\b\u0002\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r01\u0012\u0004\u0012\u00020\r0\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b2\u00103JS\u00102\u001a\u00020\r\"\n\b\u0000\u00105\u0018\u0001*\u0002042\u0006\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u001a\b\u0002\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000001\u0012\u0004\u0012\u00020\r0\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b2\u00107JK\u00102\u001a\u00020\r\"\n\b\u0000\u00105\u0018\u0001*\u0002042\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u001a\b\u0002\u0010\u001a\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000001\u0012\u0004\u0012\u00020\r0\u0018H\u0086\bø\u0001\u0000¢\u0006\u0004\b2\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u00108\u0012\u0004\b;\u0010<\u001a\u0004\b9\u0010:R*\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\f\u0010=\u0012\u0004\bA\u0010<\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u000fR4\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100B8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bC\u0010D\u0012\u0004\bI\u0010<\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR,\u0010L\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020K0B8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bL\u0010D\u0012\u0004\bN\u0010<\u001a\u0004\bM\u0010FRF\u0010O\u001a \b\u0001\u0012\u0004\u0012\u00020!\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\"\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010 8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bO\u0010P\u0012\u0004\bT\u0010<\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010%R.\u0010W\u001a\b\u0012\u0004\u0012\u00020V0U8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bW\u0010X\u0012\u0004\b]\u0010<\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006^"}, d2 = {"Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;", "Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;", "Lexpo/modules/kotlin/modules/Module;", "module", "Lexpo/modules/kotlin/types/TypeConverterProvider;", "converters", "<init>", "(Lexpo/modules/kotlin/modules/Module;Lexpo/modules/kotlin/types/TypeConverterProvider;)V", "Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "buildModule", "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "", "name", "Ljn0/h0;", "Name", "(Ljava/lang/String;)V", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "definition", "registerViewDefinition", "(Lexpo/modules/kotlin/views/ViewManagerDefinition;)V", "Landroid/view/View;", "T", "Lco0/d;", "viewClass", "Lkotlin/Function1;", "Lexpo/modules/kotlin/views/ViewDefinitionBuilder;", "body", "View", "(Lco0/d;Lwn0/l;)V", "Lkotlin/Function0;", "OnCreate", "(Lwn0/a;)V", "Lkotlin/Function2;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "Lkotlin/coroutines/Continuation;", "", "RegisterActivityContracts", "(Lwn0/p;)V", "OnDestroy", "OnActivityEntersForeground", "OnActivityEntersBackground", "OnUserLeavesActivity", "OnActivityDestroys", "Landroid/content/Intent;", "OnNewIntent", "(Lwn0/l;)V", "Landroid/app/Activity;", "Lexpo/modules/kotlin/events/OnActivityResultPayload;", "OnActivityResult", "Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;", "Class", "(Ljava/lang/String;Lwn0/l;)V", "Lexpo/modules/kotlin/sharedobjects/SharedObject;", "SharedObjectType", "sharedObjectClass", "(Ljava/lang/String;Lco0/d;Lwn0/l;)V", "Lexpo/modules/kotlin/modules/Module;", "getModule", "()Lexpo/modules/kotlin/modules/Module;", "getModule$annotations", "()V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "getName$annotations", "", "viewManagerDefinitions", "Ljava/util/Map;", "getViewManagerDefinitions", "()Ljava/util/Map;", "setViewManagerDefinitions", "(Ljava/util/Map;)V", "getViewManagerDefinitions$annotations", "Lexpo/modules/kotlin/events/EventName;", "Lexpo/modules/kotlin/events/EventListener;", "eventListeners", "getEventListeners", "getEventListeners$annotations", "registerContracts", "Lwn0/p;", "getRegisterContracts", "()Lwn0/p;", "setRegisterContracts", "getRegisterContracts$annotations", "", "Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;", "classData", "Ljava/util/List;", "getClassData", "()Ljava/util/List;", "setClassData", "(Ljava/util/List;)V", "getClassData$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DefinitionMarker
public class InternalModuleDefinitionBuilder extends ObjectDefinitionBuilder {
    private List<ClassDefinitionData> classData;
    private final Map<EventName, EventListener> eventListeners;
    private final Module module;
    private String name;
    private p<? super AppContextActivityResultCaller, ? super Continuation<? super h0>, ? extends Object> registerContracts;
    private Map<String, ViewManagerDefinition> viewManagerDefinitions;

    /* JADX WARN: Multi-variable type inference failed */
    public InternalModuleDefinitionBuilder() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void Class$default(InternalModuleDefinitionBuilder internalModuleDefinitionBuilder, String name, l body, int i11, Object obj) {
        AnyType anyType;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: Class");
        }
        if ((i11 & 2) != 0) {
            body = new l<ClassComponentBuilder<h0>, h0>() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.Class.1
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ClassComponentBuilder<h0> classComponentBuilder) {
                    s.k(classComponentBuilder, "<this>");
                }

                @Override // wn0.l
                public /* bridge */ /* synthetic */ h0 invoke(ClassComponentBuilder<h0> classComponentBuilder) {
                    invoke2(classComponentBuilder);
                    return h0.f84049a;
                }
            };
        }
        s.k(name, "name");
        s.k(body, "body");
        Module module = internalModuleDefinitionBuilder.getModule();
        if (module == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AppContext appContext = module.getAppContext();
        d dVarB = o0.b(h0.class);
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(h0.class), Boolean.FALSE));
        if (anyType2 == null) {
            anyType = new AnyType(new LazyKType(o0.b(h0.class), false, InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$1.INSTANCE), null);
        } else {
            anyType = anyType2;
        }
        ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, name, dVarB, anyType, internalModuleDefinitionBuilder.getConverters());
        body.invoke(classComponentBuilder);
        internalModuleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
    }

    public static /* synthetic */ void getClassData$annotations() {
    }

    public static /* synthetic */ void getEventListeners$annotations() {
    }

    public static /* synthetic */ void getModule$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }

    public static /* synthetic */ void getRegisterContracts$annotations() {
    }

    public static /* synthetic */ void getViewManagerDefinitions$annotations() {
    }

    public final void Class(String name, l<? super ClassComponentBuilder<h0>, h0> body) {
        AnyType anyType;
        s.k(name, "name");
        s.k(body, "body");
        Module module = getModule();
        if (module == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        AppContext appContext = module.getAppContext();
        d dVarB = o0.b(h0.class);
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(o0.b(h0.class), Boolean.FALSE));
        if (anyType2 == null) {
            anyType = new AnyType(new LazyKType(o0.b(h0.class), false, InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$1.INSTANCE), null);
        } else {
            anyType = anyType2;
        }
        ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, name, dVarB, anyType, getConverters());
        body.invoke(classComponentBuilder);
        getClassData().add(classComponentBuilder.buildClass());
    }

    public final void Name(String name) {
        s.k(name, "name");
        this.name = name;
    }

    public final void OnActivityDestroys(final wn0.a<h0> body) {
        s.k(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ACTIVITY_DESTROYS;
        eventListeners.put(eventName, new BasicEventListener(eventName, new wn0.a<h0>() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnActivityDestroys.1
            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                invoke2();
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                body.invoke();
            }
        }));
    }

    public final void OnActivityEntersBackground(final wn0.a<h0> body) {
        s.k(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ACTIVITY_ENTERS_BACKGROUND;
        eventListeners.put(eventName, new BasicEventListener(eventName, new wn0.a<h0>() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnActivityEntersBackground.1
            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                invoke2();
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                body.invoke();
            }
        }));
    }

    public final void OnActivityEntersForeground(final wn0.a<h0> body) {
        s.k(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ACTIVITY_ENTERS_FOREGROUND;
        eventListeners.put(eventName, new BasicEventListener(eventName, new wn0.a<h0>() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnActivityEntersForeground.1
            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                invoke2();
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                body.invoke();
            }
        }));
    }

    public final void OnActivityResult(final p<? super Activity, ? super OnActivityResultPayload, h0> body) {
        s.k(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ON_ACTIVITY_RESULT;
        eventListeners.put(eventName, new EventListenerWithSenderAndPayload(eventName, new p<Activity, OnActivityResultPayload, h0>() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnActivityResult.1
            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(Activity activity, OnActivityResultPayload onActivityResultPayload) {
                invoke2(activity, onActivityResultPayload);
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Activity sender, OnActivityResultPayload payload) {
                s.k(sender, "sender");
                s.k(payload, "payload");
                body.invoke(sender, payload);
            }
        }));
    }

    public final void OnCreate(final wn0.a<h0> body) {
        s.k(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.MODULE_CREATE;
        eventListeners.put(eventName, new BasicEventListener(eventName, new wn0.a<h0>() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnCreate.1
            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                invoke2();
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                body.invoke();
            }
        }));
    }

    public final void OnDestroy(final wn0.a<h0> body) {
        s.k(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.MODULE_DESTROY;
        eventListeners.put(eventName, new BasicEventListener(eventName, new wn0.a<h0>() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnDestroy.1
            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                invoke2();
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                body.invoke();
            }
        }));
    }

    public final void OnNewIntent(final l<? super Intent, h0> body) {
        s.k(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ON_NEW_INTENT;
        eventListeners.put(eventName, new EventListenerWithPayload(eventName, new l<Intent, h0>() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnNewIntent.1
            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(Intent intent) {
                invoke2(intent);
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Intent it) {
                s.k(it, "it");
                body.invoke(it);
            }
        }));
    }

    public final void OnUserLeavesActivity(final wn0.a<h0> body) {
        s.k(body, "body");
        Map<EventName, EventListener> eventListeners = getEventListeners();
        EventName eventName = EventName.ON_USER_LEAVES_ACTIVITY;
        eventListeners.put(eventName, new BasicEventListener(eventName, new wn0.a<h0>() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder.OnUserLeavesActivity.1
            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                invoke2();
                return h0.f84049a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                body.invoke();
            }
        }));
    }

    public final void RegisterActivityContracts(p<? super AppContextActivityResultCaller, ? super Continuation<? super h0>, ? extends Object> body) {
        s.k(body, "body");
        this.registerContracts = body;
    }

    public final /* synthetic */ <T extends View> void View(d<T> viewClass, l<? super ViewDefinitionBuilder<T>, h0> body) {
        s.k(viewClass, "viewClass");
        s.k(body, "body");
        s.q(4, "T");
        d dVarB = o0.b(View.class);
        s.p();
        ViewDefinitionBuilder viewDefinitionBuilder = new ViewDefinitionBuilder(viewClass, new LazyKType(dVarB, false, new wn0.a<q>() { // from class: expo.modules.kotlin.modules.InternalModuleDefinitionBuilder$View$viewDefinitionBuilder$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // wn0.a
            public final q invoke() {
                s.q(6, "T");
                return null;
            }
        }, 2, null), getConverters());
        CSSPropsKt.UseCSSProps(viewDefinitionBuilder);
        body.invoke(viewDefinitionBuilder);
        registerViewDefinition(viewDefinitionBuilder.build());
    }

    public final ModuleDefinitionData buildModule() {
        String simpleName = this.name;
        if (simpleName == null) {
            Module module = this.module;
            simpleName = module != null ? module.getClass().getSimpleName() : null;
        }
        String str = simpleName;
        if (str != null) {
            return new ModuleDefinitionData(str, buildObject(), this.viewManagerDefinitions, this.eventListeners, this.registerContracts, this.classData);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final List<ClassDefinitionData> getClassData() {
        return this.classData;
    }

    public final Map<EventName, EventListener> getEventListeners() {
        return this.eventListeners;
    }

    public final Module getModule() {
        return this.module;
    }

    public final String getName() {
        return this.name;
    }

    public final p<AppContextActivityResultCaller, Continuation<? super h0>, Object> getRegisterContracts() {
        return this.registerContracts;
    }

    public final Map<String, ViewManagerDefinition> getViewManagerDefinitions() {
        return this.viewManagerDefinitions;
    }

    public final void registerViewDefinition(ViewManagerDefinition definition) {
        s.k(definition, "definition");
        if (definition.getName() != null) {
            if (this.viewManagerDefinitions.containsKey(definition.getName())) {
                throw new IllegalArgumentException(("The module definition defines more than one view with name " + definition.getName() + ".").toString());
            }
            this.viewManagerDefinitions.put(definition.getName(), definition);
        }
        if (this.viewManagerDefinitions.containsKey(ModuleDefinitionBuilderKt.DEFAULT_MODULE_VIEW)) {
            return;
        }
        this.viewManagerDefinitions.put(ModuleDefinitionBuilderKt.DEFAULT_MODULE_VIEW, definition);
    }

    public final void setClassData(List<ClassDefinitionData> list) {
        s.k(list, "<set-?>");
        this.classData = list;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRegisterContracts(p<? super AppContextActivityResultCaller, ? super Continuation<? super h0>, ? extends Object> pVar) {
        this.registerContracts = pVar;
    }

    public final void setViewManagerDefinitions(Map<String, ViewManagerDefinition> map) {
        s.k(map, "<set-?>");
        this.viewManagerDefinitions = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ InternalModuleDefinitionBuilder(Module module, TypeConverterProvider typeConverterProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        TypeConverterProvider typeConverterProviderConverters;
        module = (i11 & 1) != 0 ? null : module;
        this(module, (i11 & 2) != 0 ? (module == null || (typeConverterProviderConverters = module.converters()) == null) ? null : TypeConverterProviderKt.mergeWithDefault(typeConverterProviderConverters) : typeConverterProvider);
    }

    public InternalModuleDefinitionBuilder(Module module, TypeConverterProvider typeConverterProvider) {
        super(typeConverterProvider);
        this.module = module;
        this.viewManagerDefinitions = new LinkedHashMap();
        this.eventListeners = new LinkedHashMap();
        this.classData = new ArrayList();
    }

    public final /* synthetic */ <SharedObjectType extends SharedObject> void Class(String name, d<SharedObjectType> sharedObjectClass, l<? super ClassComponentBuilder<SharedObjectType>, h0> body) {
        AnyType anyType;
        s.k(name, "name");
        s.k(sharedObjectClass, "sharedObjectClass");
        s.k(body, "body");
        Module module = getModule();
        if (module != null) {
            AppContext appContext = module.getAppContext();
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            s.q(4, "SharedObjectType");
            d dVarB = o0.b(Object.class);
            s.q(3, "SharedObjectType");
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
            if (anyType2 == null) {
                s.p();
                InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2 internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2 = InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2.INSTANCE;
                s.q(4, "SharedObjectType");
                d dVarB2 = o0.b(Object.class);
                s.q(3, "SharedObjectType");
                anyType = new AnyType(new LazyKType(dVarB2, false, internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2), null);
            } else {
                anyType = anyType2;
            }
            ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, name, sharedObjectClass, anyType, getConverters());
            body.invoke(classComponentBuilder);
            getClassData().add(classComponentBuilder.buildClass());
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static /* synthetic */ void Class$default(InternalModuleDefinitionBuilder internalModuleDefinitionBuilder, String name, d dVar, l body, int i11, Object obj) {
        AnyType anyType;
        if (obj == null) {
            if ((i11 & 2) != 0) {
                s.q(4, "SharedObjectType");
                dVar = o0.b(SharedObject.class);
            }
            d sharedObjectClass = dVar;
            if ((i11 & 4) != 0) {
                s.p();
                body = AnonymousClass2.INSTANCE;
            }
            s.k(name, "name");
            s.k(sharedObjectClass, "sharedObjectClass");
            s.k(body, "body");
            Module module = internalModuleDefinitionBuilder.getModule();
            if (module != null) {
                AppContext appContext = module.getAppContext();
                AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
                s.q(4, "SharedObjectType");
                d dVarB = o0.b(Object.class);
                s.q(3, "SharedObjectType");
                AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
                if (anyType2 == null) {
                    s.p();
                    InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2 internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2 = InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2.INSTANCE;
                    s.q(4, "SharedObjectType");
                    d dVarB2 = o0.b(Object.class);
                    s.q(3, "SharedObjectType");
                    anyType = new AnyType(new LazyKType(dVarB2, false, internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$2), null);
                } else {
                    anyType = anyType2;
                }
                ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, name, sharedObjectClass, anyType, internalModuleDefinitionBuilder.getConverters());
                body.invoke(classComponentBuilder);
                internalModuleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: Class");
    }

    public final /* synthetic */ <SharedObjectType extends SharedObject> void Class(d<SharedObjectType> sharedObjectClass, l<? super ClassComponentBuilder<SharedObjectType>, h0> body) {
        AnyType anyType;
        s.k(sharedObjectClass, "sharedObjectClass");
        s.k(body, "body");
        Module module = getModule();
        if (module != null) {
            AppContext appContext = module.getAppContext();
            String simpleName = vn0.a.b(sharedObjectClass).getSimpleName();
            s.j(simpleName, "getSimpleName(...)");
            AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
            s.q(4, "SharedObjectType");
            d dVarB = o0.b(Object.class);
            s.q(3, "SharedObjectType");
            AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
            if (anyType2 == null) {
                s.p();
                InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3 internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3 = InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3.INSTANCE;
                s.q(4, "SharedObjectType");
                d dVarB2 = o0.b(Object.class);
                s.q(3, "SharedObjectType");
                anyType = new AnyType(new LazyKType(dVarB2, false, internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3), null);
            } else {
                anyType = anyType2;
            }
            ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, simpleName, sharedObjectClass, anyType, getConverters());
            body.invoke(classComponentBuilder);
            getClassData().add(classComponentBuilder.buildClass());
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static /* synthetic */ void Class$default(InternalModuleDefinitionBuilder internalModuleDefinitionBuilder, d dVar, l body, int i11, Object obj) {
        AnyType anyType;
        if (obj == null) {
            if ((i11 & 1) != 0) {
                s.q(4, "SharedObjectType");
                dVar = o0.b(SharedObject.class);
            }
            d sharedObjectClass = dVar;
            if ((i11 & 2) != 0) {
                s.p();
                body = AnonymousClass3.INSTANCE;
            }
            s.k(sharedObjectClass, "sharedObjectClass");
            s.k(body, "body");
            Module module = internalModuleDefinitionBuilder.getModule();
            if (module != null) {
                AppContext appContext = module.getAppContext();
                String simpleName = vn0.a.b(sharedObjectClass).getSimpleName();
                s.j(simpleName, "getSimpleName(...)");
                AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
                s.q(4, "SharedObjectType");
                d dVarB = o0.b(Object.class);
                s.q(3, "SharedObjectType");
                AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
                if (anyType2 == null) {
                    s.p();
                    InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3 internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3 = InternalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3.INSTANCE;
                    s.q(4, "SharedObjectType");
                    d dVarB2 = o0.b(Object.class);
                    s.q(3, "SharedObjectType");
                    anyType = new AnyType(new LazyKType(dVarB2, false, internalModuleDefinitionBuilder$Class$$inlined$toAnyType$default$3), null);
                } else {
                    anyType = anyType2;
                }
                ClassComponentBuilder classComponentBuilder = new ClassComponentBuilder(appContext, simpleName, sharedObjectClass, anyType, internalModuleDefinitionBuilder.getConverters());
                body.invoke(classComponentBuilder);
                internalModuleDefinitionBuilder.getClassData().add(classComponentBuilder.buildClass());
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: Class");
    }
}
