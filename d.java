import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;

final class aad implements wr {
   final aao a;

   public aad(aao var1) {
      this.a = var1;
   }

   public final void b(boolean var1) {
      if (var1) {
         this.a.l((xg)null, 0);
      }
   }
   public final boolean h(MotionEvent var1) {
      this.a.q.onTouchEvent(var1);
      int action = var1.getActionMasked();

      switch (action) {
         case MotionEvent.ACTION_DOWN:
            handleActionDown(var1);
            break;
         case MotionEvent.ACTION_MOVE:
            handleActionMove(var1);
            break;
         case MotionEvent.ACTION_UP:
         case MotionEvent.ACTION_CANCEL:
            handleActionEnd();
            break;
         default:
            break;
      }

      updateVelocityTracker(var1);
      return this.a.b != null;
   }

   private void handleActionDown(MotionEvent var1) {
      this.a.i = var1.getPointerId(0);
      this.a.c = var1.getX();
      this.a.d = var1.getY();

      if (this.a.o != null) {
         this.a.o.recycle();
      }
      this.a.o = VelocityTracker.obtain();
   }

   private void handleActionMove(MotionEvent var1) {
      int pointerIndex = var1.findPointerIndex(this.a.i);
      if (pointerIndex >= 0) {
         this.a.f(var1.getActionMasked(), var1, pointerIndex);
      }
   }

   private void handleActionEnd() {
      this.a.i = -1;
      this.a.l((xg) null, 0);
   }

   private void updateVelocityTracker(MotionEvent var1) {
      if (this.a.o != null) {
         this.a.o.addMovement(var1);
      }
   }

      public static void i(aad aad, MotionEvent var1) {
      aad.a.q.onTouchEvent(var1);
      VelocityTracker var5 = aad.a.o;
      if (var5 != null) {
         var5.addMovement(var1);
      }

      if (aad.a.i != -1) {
         int var3 = var1.getActionMasked();
         int var4 = var1.findPointerIndex(aad.a.i);
         if (var4 >= 0) {
            aad.a.f(var3, var1, var4);
         }

         aao var9 = aad.a;
         xg var6 = var9.b;
         if (var6 != null) {
            byte var2 = 0;
            if (var3 != 1) {
               if (var3 == 2) {
                  if (var4 >= 0) {
                     var9.m(var1, var9.k, var4);
                     aad.a.h(var6);
                     aao var8 = aad.a;
                     var8.m.removeCallbacks(var8.n);
                     aad.a.n.run();
                     aad.a.m.invalidate();
                     return;
                  }

                  return;
               }

               if (var3 != 3) {
                  if (var3 == 6) {
                     var3 = var1.getActionIndex();
                     var4 = var1.getPointerId(var3);
                     var9 = aad.a;
                     if (var4 == var9.i) {
                        if (var3 == 0) {
                           var2 = 1;
                        }

                        var9.i = var1.getPointerId(var2);
                        var9 = aad.a;
                        var9.m(var1, var9.k, var3);
                        return;
                     }
                  }

                  return;
               }

               VelocityTracker var7 = var9.o;
               if (var7 != null) {
                  var7.clear();
               }
            }

            aad.a.l((xg)null, 0);
            aad.a.i = -1;
         }
      }

   }
}

