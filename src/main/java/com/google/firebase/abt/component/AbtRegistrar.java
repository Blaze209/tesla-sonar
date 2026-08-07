package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import qw.h;
import yu.c;
import yu.d;
import yu.g;
import yu.q;

/* JADX INFO: loaded from: classes5.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a a(d dVar) {
        return new a((Context) dVar.a(Context.class), dVar.h(wu.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(a.class).h(LIBRARY_NAME).b(q.k(Context.class)).b(q.i(wu.a.class)).f(new g() { // from class: uu.a
            @Override // yu.g
            public final Object a(d dVar) {
                return AbtRegistrar.a(dVar);
            }
        }).d(), h.b(LIBRARY_NAME, "21.1.1"));
    }
}
