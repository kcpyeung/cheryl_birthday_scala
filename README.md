A scala implementation of https://github.com/kcpyeung/cheryl_birthday

I enjoyed the clojure implementation more because of its uniform mental model of "apply function in front of collection, get new collection, apply another function in front of collection, get another collection..."

In scala, I apply a function in front (eg, filter), get a collection, and now have to invoke map at the back of the line using .map. Felt clunky.
