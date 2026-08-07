package com.swmansion.gesturehandler.core;

import android.content.Context;
import android.view.MotionEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/swmansion/gesturehandler/core/d;", "Lcom/swmansion/gesturehandler/core/GestureHandler;", "<init>", "()V", "Landroid/view/MotionEvent;", "event", "sourceEvent", "Ljn0/h0;", "l0", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V", "a", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends GestureHandler {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/swmansion/gesturehandler/core/d$a;", "Lcom/swmansion/gesturehandler/core/GestureHandler$b;", "Lcom/swmansion/gesturehandler/core/d;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "g", "(Landroid/content/Context;)Lcom/swmansion/gesturehandler/core/d;", "handler", "Lz90/e;", "h", "(Lcom/swmansion/gesturehandler/core/d;)Lz90/e;", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "c", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "name", "react-native-gesture-handler_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends GestureHandler.b<d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Class<d> type = d.class;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String name = "ManualGestureHandler";

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: d, reason: from getter */
        public String getName() {
            return this.name;
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        public Class<d> e() {
            return this.type;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public d a(Context context) {
            return new d();
        }

        @Override // com.swmansion.gesturehandler.core.GestureHandler.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public z90.e c(d handler) {
            s.k(handler, "handler");
            return new z90.e(handler);
        }
    }

    @Override // com.swmansion.gesturehandler.core.GestureHandler
    protected void l0(MotionEvent event, MotionEvent sourceEvent) {
        s.k(event, "event");
        s.k(sourceEvent, "sourceEvent");
        if (getState() == 0) {
            p();
        }
    }
}
