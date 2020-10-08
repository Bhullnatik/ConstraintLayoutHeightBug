## Reproduction for bug on constrainedHeight in recent `ConstraintLayout` versions

Until `androidx.constraintlayout:constraintlayout:2.0.0-beta8`, `MainActivity` will print:

```
D/Issue: View has height = 200*, measured = 200*
```

which is valid, since we expect the `issue` view to be constrained to be 400 (root size) - 100 (top view height) - 100 (bottom view height) = 200

After `androidx.constraintlayout:constraintlayout:2.0.0-rc1`

```
D/Issue: View has height = 200*, measured = 400*
```

*: adjusted to dp


## Issue link

[https://issuetracker.google.com/issues/170189141](https://issuetracker.google.com/issues/170189141)
