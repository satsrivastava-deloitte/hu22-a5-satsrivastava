import { combineReducers } from "redux";
import posts, { IPosts } from "./posts";

export interface IApplicationState {
  posts: IPosts;
}

export default combineReducers({
  posts,
});
