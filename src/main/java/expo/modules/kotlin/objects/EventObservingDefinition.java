package expo.modules.kotlin.objects;

import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0004\u0017\u0018\u0019\u001aB%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u001b"}, d2 = {"Lexpo/modules/kotlin/objects/EventObservingDefinition;", "", "Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;", "type", "Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;", "filer", "Lkotlin/Function0;", "Ljn0/h0;", "body", "<init>", "(Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;Lwn0/a;)V", "", "eventName", "", "shouldBeInvoked$expo_modules_core_release", "(Ljava/lang/String;)Z", "shouldBeInvoked", "eventType", "invokedIfNeed", "(Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;Ljava/lang/String;)V", "Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;", "Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;", "Lwn0/a;", "Type", "Filter", "AllEventsFilter", "SelectedEventFiler", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EventObservingDefinition {
    private final wn0.a<h0> body;
    private final Filter filer;
    private final Type type;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lexpo/modules/kotlin/objects/EventObservingDefinition$AllEventsFilter;", "Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AllEventsFilter extends Filter {
        public static final AllEventsFilter INSTANCE = new AllEventsFilter();

        private AllEventsFilter() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof AllEventsFilter);
        }

        public int hashCode() {
            return 728698842;
        }

        public String toString() {
            return "AllEventsFilter";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;", "", "<init>", "()V", "Lexpo/modules/kotlin/objects/EventObservingDefinition$AllEventsFilter;", "Lexpo/modules/kotlin/objects/EventObservingDefinition$SelectedEventFiler;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Filter {
        public /* synthetic */ Filter(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Filter() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/objects/EventObservingDefinition$SelectedEventFiler;", "Lexpo/modules/kotlin/objects/EventObservingDefinition$Filter;", "event", "", "<init>", "(Ljava/lang/String;)V", "getEvent", "()Ljava/lang/String;", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SelectedEventFiler extends Filter {
        private final String event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectedEventFiler(String event) {
            super(null);
            s.k(event, "event");
            this.event = event;
        }

        public final String getEvent() {
            return this.event;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "StartObserving", "StopObserving", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum Type {
        StartObserving("startObserving"),
        StopObserving("stopObserving");

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());
        private final String value;

        Type(String str) {
            this.value = str;
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public EventObservingDefinition(Type type, Filter filer, wn0.a<h0> body) {
        s.k(type, "type");
        s.k(filer, "filer");
        s.k(body, "body");
        this.type = type;
        this.filer = filer;
        this.body = body;
    }

    public final void invokedIfNeed(Type eventType, String eventName) {
        s.k(eventType, "eventType");
        s.k(eventName, "eventName");
        if (eventType == this.type && shouldBeInvoked$expo_modules_core_release(eventName)) {
            this.body.invoke();
        }
    }

    public final boolean shouldBeInvoked$expo_modules_core_release(String eventName) {
        s.k(eventName, "eventName");
        Filter filter = this.filer;
        if (filter instanceof AllEventsFilter) {
            return true;
        }
        if (filter instanceof SelectedEventFiler) {
            return s.f(((SelectedEventFiler) filter).getEvent(), eventName);
        }
        throw new NoWhenBranchMatchedException();
    }
}
