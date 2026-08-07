package expo.modules.kotlin;

import android.view.View;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.modules.Module;
import expo.modules.kotlin.views.ViewManagerDefinition;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import jn0.m;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001:\u0001KB\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\b\"\b\b\u0000\u0010\u0015*\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0017\u001a\u00020\b2\u0012\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0019\"\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u001bJ\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u0017\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u0004\u0018\u00010\u00142\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b#\u0010$J\u001a\u0010#\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0015\u0018\u0001H\u0086\b¢\u0006\u0004\b#\u0010%J\u001b\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b&\u0010'J'\u0010&\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0015*\u00020\u00142\u0006\u0010\u0016\u001a\u00028\u0000¢\u0006\u0004\b&\u0010(J+\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002\"\b\b\u0000\u0010\u0015*\u00020)2\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*¢\u0006\u0004\b&\u0010,J3\u0010/\u001a\u0004\u0018\u00010.\"\b\b\u0000\u0010\u0015*\u00020)2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030\u00022\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\b¢\u0006\u0004\b1\u0010\nJ\u0015\u00102\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b2\u00103J#\u00102\u001a\u00020\b\"\u0004\b\u0000\u001042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b2\u00105J1\u00102\u001a\u00020\b\"\u0004\b\u0000\u00104\"\u0004\b\u0001\u001062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b2\u00107J\u001a\u00109\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000208H\u0096\u0002¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00020\b¢\u0006\u0004\b;\u0010\nJ\u000f\u0010=\u001a\u00020\bH\u0000¢\u0006\u0004\b<\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010>R0\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\u001f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020?8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010\n\u001a\u0004\bB\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020F0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010I\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lexpo/modules/kotlin/ModuleRegistry;", "", "Lexpo/modules/kotlin/ModuleHolder;", "Ljava/lang/ref/WeakReference;", "Lexpo/modules/kotlin/RuntimeContext;", "runtimeContext", "<init>", "(Ljava/lang/ref/WeakReference;)V", "Ljn0/h0;", "readyForPostingEvents", "()V", "flushTheEventQueue", "Lexpo/modules/kotlin/events/EventName;", "eventName", "", "sender", StatusResponse.PAYLOAD, "", "addToQueueIfNeeded", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;Ljava/lang/Object;)Z", "Lexpo/modules/kotlin/modules/Module;", "T", "module", "register", "(Lexpo/modules/kotlin/modules/Module;)V", "", "modules", "([Lexpo/modules/kotlin/modules/Module;)V", "Lexpo/modules/kotlin/ModulesProvider;", "provider", "(Lexpo/modules/kotlin/ModulesProvider;)Lexpo/modules/kotlin/ModuleRegistry;", "", "name", "hasModule", "(Ljava/lang/String;)Z", "getModule", "(Ljava/lang/String;)Lexpo/modules/kotlin/modules/Module;", "()Ljava/lang/Object;", "getModuleHolder", "(Ljava/lang/String;)Lexpo/modules/kotlin/ModuleHolder;", "(Lexpo/modules/kotlin/modules/Module;)Lexpo/modules/kotlin/ModuleHolder;", "Landroid/view/View;", "Ljava/lang/Class;", "viewClass", "(Ljava/lang/Class;)Lexpo/modules/kotlin/ModuleHolder;", "holder", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "getViewDefinition", "(Lexpo/modules/kotlin/ModuleHolder;Ljava/lang/Class;)Lexpo/modules/kotlin/views/ViewManagerDefinition;", "postOnCreate", "post", "(Lexpo/modules/kotlin/events/EventName;)V", "Sender", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;)V", "Payload", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;Ljava/lang/Object;)V", "", "iterator", "()Ljava/util/Iterator;", "cleanUp", "registerActivityContracts$expo_modules_core_release", "registerActivityContracts", "Ljava/lang/ref/WeakReference;", "", "registry", "Ljava/util/Map;", "getRegistry", "()Ljava/util/Map;", "getRegistry$annotations", "", "Lexpo/modules/kotlin/ModuleRegistry$PostponedEvent;", "eventQueue", "Ljava/util/List;", "isReadyForPostingEvents", "Z", "PostponedEvent", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ModuleRegistry implements Iterable<ModuleHolder<?>>, xn0.a {
    private final List<PostponedEvent> eventQueue;
    private boolean isReadyForPostingEvents;
    private final Map<String, ModuleHolder<?>> registry;
    private final WeakReference<RuntimeContext> runtimeContext;

    public ModuleRegistry(WeakReference<RuntimeContext> runtimeContext) {
        s.k(runtimeContext, "runtimeContext");
        this.runtimeContext = runtimeContext;
        this.registry = new LinkedHashMap();
        this.eventQueue = new ArrayList();
    }

    private final boolean addToQueueIfNeeded(EventName eventName, Object sender, Object payload) {
        synchronized (this) {
            if (this.isReadyForPostingEvents) {
                return false;
            }
            this.eventQueue.add(new PostponedEvent(eventName, sender, payload));
            return true;
        }
    }

    static /* synthetic */ boolean addToQueueIfNeeded$default(ModuleRegistry moduleRegistry, EventName eventName, Object obj, Object obj2, int i11, Object obj3) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            obj2 = null;
        }
        return moduleRegistry.addToQueueIfNeeded(eventName, obj, obj2);
    }

    private final void flushTheEventQueue() {
        synchronized (this) {
            try {
                for (PostponedEvent postponedEvent : this.eventQueue) {
                    Iterator<ModuleHolder<?>> it = iterator();
                    while (it.hasNext()) {
                        postponedEvent.post(it.next());
                    }
                }
                this.eventQueue.clear();
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void getRegistry$annotations() {
    }

    private final void readyForPostingEvents() {
        synchronized (this) {
            this.isReadyForPostingEvents = true;
            h0 h0Var = h0.f84049a;
        }
    }

    public final void cleanUp() {
        this.registry.clear();
        CoreLoggerKt.getLogger().info("✅ ModuleRegistry was destroyed");
    }

    public final Module getModule(String name) {
        s.k(name, "name");
        ModuleHolder<?> moduleHolder = this.registry.get(name);
        if (moduleHolder != null) {
            return moduleHolder.getModule();
        }
        return null;
    }

    public final ModuleHolder<?> getModuleHolder(String name) {
        s.k(name, "name");
        return this.registry.get(name);
    }

    public final Map<String, ModuleHolder<?>> getRegistry() {
        return this.registry;
    }

    public final <T extends View> ViewManagerDefinition getViewDefinition(ModuleHolder<?> holder, Class<T> viewClass) {
        Object next;
        s.k(holder, "holder");
        s.k(viewClass, "viewClass");
        Iterator<T> it = holder.getDefinition().getViewManagerDefinitions().values().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (s.f(((ViewManagerDefinition) next).getViewType$expo_modules_core_release(), viewClass)) {
                return (ViewManagerDefinition) next;
            }
        }
        next = null;
        return (ViewManagerDefinition) next;
    }

    public final boolean hasModule(String name) {
        s.k(name, "name");
        return this.registry.containsKey(name);
    }

    @Override // java.lang.Iterable
    public Iterator<ModuleHolder<?>> iterator() {
        return this.registry.values().iterator();
    }

    public final void post(EventName eventName) {
        s.k(eventName, "eventName");
        if (addToQueueIfNeeded$default(this, eventName, null, null, 6, null)) {
            return;
        }
        Iterator<ModuleHolder<?>> it = iterator();
        while (it.hasNext()) {
            it.next().post(eventName);
        }
    }

    public final void postOnCreate() {
        Iterator<ModuleHolder<?>> it = iterator();
        while (it.hasNext()) {
            it.next().post(EventName.MODULE_CREATE);
        }
        registerActivityContracts$expo_modules_core_release();
        readyForPostingEvents();
        flushTheEventQueue();
    }

    public final <T extends Module> void register(T module) {
        s.k(module, "module");
        eb.a.c("[ExpoModulesCore] " + ("ModuleRegistry.register(" + module.getClass() + ")"));
        try {
            Object obj = this.runtimeContext.get();
            if (obj == null) {
                throw new IllegalArgumentException("Cannot create a module for invalid runtime context.");
            }
            module.set_runtimeContext$expo_modules_core_release((RuntimeContext) obj);
            final ModuleHolder<?> moduleHolder = new ModuleHolder<>(module);
            module.setCoroutineScopeDelegate(m.b(new wn0.a<CoroutineScope>() { // from class: expo.modules.kotlin.ModuleRegistry$register$1$2
                @Override // wn0.a
                public final CoroutineScope invoke() {
                    return CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)).plus(new CoroutineName(moduleHolder.getDefinition().getName())));
                }
            }));
            getRegistry().put(moduleHolder.getName(), moduleHolder);
            h0 h0Var = h0.f84049a;
            eb.a.f();
        } catch (Throwable th2) {
            eb.a.f();
            throw th2;
        }
    }

    public final void registerActivityContracts$expo_modules_core_release() {
        Iterator<ModuleHolder<?>> it = iterator();
        while (it.hasNext()) {
            it.next().registerContracts();
        }
    }

    public final /* synthetic */ <T> T getModule() {
        T t11;
        T next;
        Module module;
        Iterator<T> it = getRegistry().values().iterator();
        do {
            t11 = null;
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
            module = ((ModuleHolder) next).getModule();
            s.q(3, "T");
        } while (module == null);
        ModuleHolder moduleHolder = next;
        if (moduleHolder != null) {
            t11 = (T) moduleHolder.getModule();
        }
        s.q(2, "T");
        return t11;
    }

    public final <T extends Module> ModuleHolder<T> getModuleHolder(T module) {
        Object next;
        s.k(module, "module");
        Iterator<T> it = this.registry.values().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ModuleHolder) next).getModule() != module);
        if (next instanceof ModuleHolder) {
            return (ModuleHolder) next;
        }
        return null;
    }

    public final <T extends View> ModuleHolder<?> getModuleHolder(Class<T> viewClass) {
        ModuleHolder<?> moduleHolder;
        s.k(viewClass, "viewClass");
        Iterator<Map.Entry<String, ModuleHolder<?>>> it = this.registry.entrySet().iterator();
        do {
            moduleHolder = null;
            if (!it.hasNext()) {
                break;
            }
            ModuleHolder<?> value = it.next().getValue();
            if (getViewDefinition(value, viewClass) != null) {
                moduleHolder = value;
            }
        } while (moduleHolder == null);
        return moduleHolder;
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J2\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b\"\u0010\u0010¨\u0006#"}, d2 = {"Lexpo/modules/kotlin/ModuleRegistry$PostponedEvent;", "", "Lexpo/modules/kotlin/events/EventName;", "eventName", "sender", StatusResponse.PAYLOAD, "<init>", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;Ljava/lang/Object;)V", "Lexpo/modules/kotlin/ModuleHolder;", "moduleHolder", "Ljn0/h0;", "post", "(Lexpo/modules/kotlin/ModuleHolder;)V", "component1", "()Lexpo/modules/kotlin/events/EventName;", "component2", "()Ljava/lang/Object;", "component3", "copy", "(Lexpo/modules/kotlin/events/EventName;Ljava/lang/Object;Ljava/lang/Object;)Lexpo/modules/kotlin/ModuleRegistry$PostponedEvent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lexpo/modules/kotlin/events/EventName;", "getEventName", "Ljava/lang/Object;", "getSender", "getPayload", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PostponedEvent {
        private final EventName eventName;
        private final Object payload;
        private final Object sender;

        public PostponedEvent(EventName eventName, Object obj, Object obj2) {
            s.k(eventName, "eventName");
            this.eventName = eventName;
            this.sender = obj;
            this.payload = obj2;
        }

        public static /* synthetic */ PostponedEvent copy$default(PostponedEvent postponedEvent, EventName eventName, Object obj, Object obj2, int i11, Object obj3) {
            if ((i11 & 1) != 0) {
                eventName = postponedEvent.eventName;
            }
            if ((i11 & 2) != 0) {
                obj = postponedEvent.sender;
            }
            if ((i11 & 4) != 0) {
                obj2 = postponedEvent.payload;
            }
            return postponedEvent.copy(eventName, obj, obj2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EventName getEventName() {
            return this.eventName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Object getSender() {
            return this.sender;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Object getPayload() {
            return this.payload;
        }

        public final PostponedEvent copy(EventName eventName, Object sender, Object payload) {
            s.k(eventName, "eventName");
            return new PostponedEvent(eventName, sender, payload);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PostponedEvent)) {
                return false;
            }
            PostponedEvent postponedEvent = (PostponedEvent) other;
            return this.eventName == postponedEvent.eventName && s.f(this.sender, postponedEvent.sender) && s.f(this.payload, postponedEvent.payload);
        }

        public final EventName getEventName() {
            return this.eventName;
        }

        public final Object getPayload() {
            return this.payload;
        }

        public final Object getSender() {
            return this.sender;
        }

        public int hashCode() {
            int iHashCode = this.eventName.hashCode() * 31;
            Object obj = this.sender;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.payload;
            return iHashCode2 + (obj2 != null ? obj2.hashCode() : 0);
        }

        public final void post(ModuleHolder<?> moduleHolder) {
            Object obj;
            s.k(moduleHolder, "moduleHolder");
            Object obj2 = this.sender;
            if (obj2 != null && (obj = this.payload) != null) {
                moduleHolder.post(this.eventName, obj2, obj);
            } else if (obj2 != null) {
                moduleHolder.post(this.eventName, obj2);
            } else {
                moduleHolder.post(this.eventName);
            }
        }

        public String toString() {
            return "PostponedEvent(eventName=" + this.eventName + ", sender=" + this.sender + ", payload=" + this.payload + ")";
        }

        public /* synthetic */ PostponedEvent(EventName eventName, Object obj, Object obj2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(eventName, (i11 & 2) != 0 ? null : obj, (i11 & 4) != 0 ? null : obj2);
        }
    }

    public final <Sender> void post(EventName eventName, Sender sender) {
        s.k(eventName, "eventName");
        if (addToQueueIfNeeded$default(this, eventName, sender, null, 4, null)) {
            return;
        }
        Iterator<ModuleHolder<?>> it = iterator();
        while (it.hasNext()) {
            it.next().post(eventName, sender);
        }
    }

    public final <Sender, Payload> void post(EventName eventName, Sender sender, Payload payload) {
        s.k(eventName, "eventName");
        if (addToQueueIfNeeded(eventName, sender, payload)) {
            return;
        }
        Iterator<ModuleHolder<?>> it = iterator();
        while (it.hasNext()) {
            it.next().post(eventName, sender, payload);
        }
    }

    public final ModuleRegistry register(ModulesProvider provider) {
        s.k(provider, "provider");
        Iterator<T> it = provider.getModulesList().iterator();
        while (it.hasNext()) {
            Module module = (Module) ((Class) it.next()).getDeclaredConstructor(null).newInstance(null);
            s.h(module);
            register(module);
        }
        return this;
    }

    public final void register(Module... modules) {
        s.k(modules, "modules");
        for (Module module : modules) {
            register(module);
        }
    }
}
