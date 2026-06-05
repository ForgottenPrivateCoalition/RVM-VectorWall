# RVM VectorWall

**Lightweight Velocity plugin with one-time token authentication**

---

**RVM VectorWall** is a Velocity proxy plugin that provides secure server access through a one-time token (UUID) system. The plugin checks each connecting player's UUID against an HSQLDB database and only allows access to those whose UUID has been pre-added. After successful login, the token is automatically deleted, preventing reuse.

### Main Mechanics

1. **You** (admin or external system) add a player's UUID to the token database
2. **Player** connects to Velocity
3. **Plugin** checks if the UUID exists in the database
4. **If found** → player is allowed to join the server, token is deleted
5. **If not found** → player is rejected with an unauthorized access message

---

## Features

- ✅ **One-time tokens** — each token is used only once
- ✅ **Automatic deletion** — token is removed immediately after successful login
- ✅ **Logging** — detailed logs for each successful or failed attempt
- ✅ **Simple** — no client-side mods required
- ✅ **HSQLDB** — embedded database, no separate server required
- ✅ **Velocity 3.5.0+** — fully compatible with latest versions

---

## Requirements

- **Velocity** 3.5.0 or higher
- **Java** 17 or higher
