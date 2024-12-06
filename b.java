import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.Set;

public final class aact {
   public final Rect a = new Rect();
   public final Set b = zff.c();
   public int c;
   public int d;
   public int e;

   public final int a(View var1) {
      int var2 = getVar2(var1);

      if (var2 < 0) {
         int var3 = this.e;
         var2 = this.c;
         return var3 > var2 ? var3 : var2 + this.d;
      } else {
         return var2 + this.c;
      }
   }

   private static int getVar2(View var1) {
      WindowInsets var4;
      if (var1 != null) {
         var4 = var1.getRootWindowInsets();
      } else {
         var4 = null;
      }

      int var2;
      if (var4 != null) {
         var2 = var4.getStableInsetTop();
      } else {
         var2 = -1;
      }
      return var2;
   }

   public final void b(View var1) {
      if (var1 != null) {
         int var2;
         int var3;
         Rect var4;
         if ((Boolean)var1.getTag(2131363630)) {
            var3 = this.a.left;
            var2 = this.a(var1);
            var4 = this.a;
            var1.setPadding(var3, var2, var4.right, var4.bottom);
            return;
         }

         ViewGroup.MarginLayoutParams var5 = (ViewGroup.MarginLayoutParams)var1.getLayoutParams();
         var2 = this.a.left;
         var3 = this.a(var1);
         var4 = this.a;
         var5.setMargins(var2, var3, var4.right, var4.bottom);
         var1.setLayoutParams(var5);
      }

   }

   public final void c(View var1, boolean var2) {
      var1.setTag(2131363630, var2);
      this.b(var1);
      this.b.add(var1);
   }
}

