package expo.modules.kotlin.objects;

import expo.modules.kotlin.ConcatIterator;
import expo.modules.kotlin.events.EventsDefinition;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.functions.BaseAsyncFunctionComponent;
import expo.modules.kotlin.functions.SyncFunctionComponent;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B}\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u0003\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014R+\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b \u0010\u001aR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "", "Lkotlin/Function0;", "", "", "legacyConstantsProvider", "Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "syncFunctions", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "asyncFunctions", "Lexpo/modules/kotlin/events/EventsDefinition;", "eventsDefinition", "Lexpo/modules/kotlin/objects/PropertyComponent;", "properties", "Lexpo/modules/kotlin/objects/ConstantComponent;", "constants", "<init>", "(Lwn0/a;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/events/EventsDefinition;Ljava/util/Map;Ljava/util/Map;)V", "other", "plus", "(Lexpo/modules/kotlin/objects/ObjectDefinitionData;)Lexpo/modules/kotlin/objects/ObjectDefinitionData;", "Lwn0/a;", "getLegacyConstantsProvider", "()Lwn0/a;", "Ljava/util/Map;", "getSyncFunctions", "()Ljava/util/Map;", "getAsyncFunctions", "Lexpo/modules/kotlin/events/EventsDefinition;", "getEventsDefinition", "()Lexpo/modules/kotlin/events/EventsDefinition;", "getProperties", "getConstants", "Lexpo/modules/kotlin/ConcatIterator;", "Lexpo/modules/kotlin/functions/AnyFunction;", "getFunctions", "()Lexpo/modules/kotlin/ConcatIterator;", "functions", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ObjectDefinitionData {
    private final Map<String, BaseAsyncFunctionComponent> asyncFunctions;
    private final Map<String, ConstantComponent> constants;
    private final EventsDefinition eventsDefinition;
    private final wn0.a<Map<String, Object>> legacyConstantsProvider;
    private final Map<String, PropertyComponent> properties;
    private final Map<String, SyncFunctionComponent> syncFunctions;

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectDefinitionData(wn0.a<? extends Map<String, ? extends Object>> legacyConstantsProvider, Map<String, SyncFunctionComponent> syncFunctions, Map<String, ? extends BaseAsyncFunctionComponent> asyncFunctions, EventsDefinition eventsDefinition, Map<String, PropertyComponent> properties, Map<String, ConstantComponent> constants) {
        s.k(legacyConstantsProvider, "legacyConstantsProvider");
        s.k(syncFunctions, "syncFunctions");
        s.k(asyncFunctions, "asyncFunctions");
        s.k(properties, "properties");
        s.k(constants, "constants");
        this.legacyConstantsProvider = legacyConstantsProvider;
        this.syncFunctions = syncFunctions;
        this.asyncFunctions = asyncFunctions;
        this.eventsDefinition = eventsDefinition;
        this.properties = properties;
        this.constants = constants;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map plus$lambda$0(ObjectDefinitionData objectDefinitionData, ObjectDefinitionData objectDefinitionData2) {
        return v0.r(objectDefinitionData.legacyConstantsProvider.invoke(), objectDefinitionData2.legacyConstantsProvider.invoke());
    }

    public final Map<String, BaseAsyncFunctionComponent> getAsyncFunctions() {
        return this.asyncFunctions;
    }

    public final Map<String, ConstantComponent> getConstants() {
        return this.constants;
    }

    public final EventsDefinition getEventsDefinition() {
        return this.eventsDefinition;
    }

    public final ConcatIterator<AnyFunction> getFunctions() {
        return new ConcatIterator<>(this.syncFunctions.values().iterator(), this.asyncFunctions.values().iterator());
    }

    public final wn0.a<Map<String, Object>> getLegacyConstantsProvider() {
        return this.legacyConstantsProvider;
    }

    public final Map<String, PropertyComponent> getProperties() {
        return this.properties;
    }

    public final Map<String, SyncFunctionComponent> getSyncFunctions() {
        return this.syncFunctions;
    }

    public final ObjectDefinitionData plus(final ObjectDefinitionData other) {
        if (other == null) {
            return this;
        }
        wn0.a aVar = new wn0.a() { // from class: expo.modules.kotlin.objects.d
            @Override // wn0.a
            public final Object invoke() {
                return ObjectDefinitionData.plus$lambda$0(this.f63378a, other);
            }
        };
        Map mapR = v0.r(this.syncFunctions, other.syncFunctions);
        Map mapR2 = v0.r(this.asyncFunctions, other.asyncFunctions);
        EventsDefinition eventsDefinition = this.eventsDefinition;
        return new ObjectDefinitionData(aVar, mapR, mapR2, eventsDefinition != null ? eventsDefinition.plus(other.eventsDefinition) : null, v0.r(this.properties, other.properties), v0.r(this.constants, other.constants));
    }
}
