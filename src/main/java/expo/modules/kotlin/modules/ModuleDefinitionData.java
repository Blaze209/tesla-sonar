package expo.modules.kotlin.modules;

import expo.modules.kotlin.ConcatIterator;
import expo.modules.kotlin.activityresult.AppContextActivityResultCaller;
import expo.modules.kotlin.classcomponent.ClassDefinitionData;
import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.EventsDefinition;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.functions.BaseAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import expo.modules.kotlin.objects.ConstantComponent;
import expo.modules.kotlin.objects.ObjectDefinitionData;
import expo.modules.kotlin.objects.PropertyComponent;
import expo.modules.kotlin.views.ViewManagerDefinition;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0006\u0012&\b\u0002\u0010\u0010\u001a \b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR5\u0010\u0010\u001a \b\u0001\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010%R+\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R#\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020+0\u00068\u0006¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010\u001eR#\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020.0\u00068\u0006¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u0010\u001eR\u0019\u00102\u001a\u0004\u0018\u0001018\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R#\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002060\u00068\u0006¢\u0006\f\n\u0004\b7\u0010\u001c\u001a\u0004\b8\u0010\u001eR#\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002090\u00068\u0006¢\u0006\f\n\u0004\b:\u0010\u001c\u001a\u0004\b;\u0010\u001eR\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "", "", "name", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "objectDefinition", "", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "viewManagerDefinitions", "Lexpo/modules/kotlin/events/EventName;", "Lexpo/modules/kotlin/events/EventListener;", "eventListeners", "Lkotlin/Function2;", "Lexpo/modules/kotlin/activityresult/AppContextActivityResultCaller;", "Lkotlin/coroutines/Continuation;", "Ljn0/h0;", "registerContracts", "", "Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;", "classData", "<init>", "(Ljava/lang/String;Lexpo/modules/kotlin/objects/ObjectDefinitionData;Ljava/util/Map;Ljava/util/Map;Lwn0/p;Ljava/util/List;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "getObjectDefinition", "()Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "Ljava/util/Map;", "getViewManagerDefinitions", "()Ljava/util/Map;", "getEventListeners", "Lwn0/p;", "getRegisterContracts", "()Lwn0/p;", "Ljava/util/List;", "getClassData", "()Ljava/util/List;", "Lkotlin/Function0;", "constantsProvider", "Lwn0/a;", "getConstantsProvider", "()Lwn0/a;", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "syncFunctions", "getSyncFunctions", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "asyncFunctions", "getAsyncFunctions", "Lexpo/modules/kotlin/events/EventsDefinition;", "eventsDefinition", "Lexpo/modules/kotlin/events/EventsDefinition;", "getEventsDefinition", "()Lexpo/modules/kotlin/events/EventsDefinition;", "Lexpo/modules/kotlin/objects/PropertyComponent;", "properties", "getProperties", "Lexpo/modules/kotlin/objects/ConstantComponent;", "constants", "getConstants", "Lexpo/modules/kotlin/ConcatIterator;", "Lexpo/modules/kotlin/functions/AnyFunction;", "functions", "Lexpo/modules/kotlin/ConcatIterator;", "getFunctions", "()Lexpo/modules/kotlin/ConcatIterator;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ModuleDefinitionData {
    private final Map<String, BaseAsyncFunctionComponent> asyncFunctions;
    private final List<ClassDefinitionData> classData;
    private final Map<String, ConstantComponent> constants;
    private final wn0.a<Map<String, Object>> constantsProvider;
    private final Map<EventName, EventListener> eventListeners;
    private final EventsDefinition eventsDefinition;
    private final ConcatIterator<AnyFunction> functions;
    private final String name;
    private final ObjectDefinitionData objectDefinition;
    private final Map<String, PropertyComponent> properties;
    private final p<AppContextActivityResultCaller, Continuation<? super h0>, Object> registerContracts;
    private final Map<String, SyncFunctionComponent> syncFunctions;
    private final Map<String, ViewManagerDefinition> viewManagerDefinitions;

    /* JADX WARN: Multi-variable type inference failed */
    public ModuleDefinitionData(String name, ObjectDefinitionData objectDefinition, Map<String, ViewManagerDefinition> viewManagerDefinitions, Map<EventName, ? extends EventListener> eventListeners, p<? super AppContextActivityResultCaller, ? super Continuation<? super h0>, ? extends Object> pVar, List<ClassDefinitionData> classData) {
        s.k(name, "name");
        s.k(objectDefinition, "objectDefinition");
        s.k(viewManagerDefinitions, "viewManagerDefinitions");
        s.k(eventListeners, "eventListeners");
        s.k(classData, "classData");
        this.name = name;
        this.objectDefinition = objectDefinition;
        this.viewManagerDefinitions = viewManagerDefinitions;
        this.eventListeners = eventListeners;
        this.registerContracts = pVar;
        this.classData = classData;
        this.constantsProvider = objectDefinition.getLegacyConstantsProvider();
        this.syncFunctions = objectDefinition.getSyncFunctions();
        this.asyncFunctions = objectDefinition.getAsyncFunctions();
        this.eventsDefinition = objectDefinition.getEventsDefinition();
        this.properties = objectDefinition.getProperties();
        this.constants = objectDefinition.getConstants();
        this.functions = objectDefinition.getFunctions();
    }

    public final Map<String, BaseAsyncFunctionComponent> getAsyncFunctions() {
        return this.asyncFunctions;
    }

    public final List<ClassDefinitionData> getClassData() {
        return this.classData;
    }

    public final Map<String, ConstantComponent> getConstants() {
        return this.constants;
    }

    public final wn0.a<Map<String, Object>> getConstantsProvider() {
        return this.constantsProvider;
    }

    public final Map<EventName, EventListener> getEventListeners() {
        return this.eventListeners;
    }

    public final EventsDefinition getEventsDefinition() {
        return this.eventsDefinition;
    }

    public final ConcatIterator<AnyFunction> getFunctions() {
        return this.functions;
    }

    public final String getName() {
        return this.name;
    }

    public final ObjectDefinitionData getObjectDefinition() {
        return this.objectDefinition;
    }

    public final Map<String, PropertyComponent> getProperties() {
        return this.properties;
    }

    public final p<AppContextActivityResultCaller, Continuation<? super h0>, Object> getRegisterContracts() {
        return this.registerContracts;
    }

    public final Map<String, SyncFunctionComponent> getSyncFunctions() {
        return this.syncFunctions;
    }

    public final Map<String, ViewManagerDefinition> getViewManagerDefinitions() {
        return this.viewManagerDefinitions;
    }

    public /* synthetic */ ModuleDefinitionData(String str, ObjectDefinitionData objectDefinitionData, Map map, Map map2, p pVar, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, objectDefinitionData, (i11 & 4) != 0 ? v0.i() : map, (i11 & 8) != 0 ? v0.i() : map2, (i11 & 16) != 0 ? null : pVar, (i11 & 32) != 0 ? v.m() : list);
    }
}
