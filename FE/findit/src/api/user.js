import UserApi from "./UserApi";

function requestJoin(id, pw, nickname, success, fail) {
  UserApi.post("users", { id: id, pw: pw, nickname: nickname }).then(success).catch(fail);
}

function requestLogin(id, pw, success, fail) {
  UserApi.post("users/login", { id: id, pw: pw }).then(success).catch(fail)
}

export { requestJoin, requestLogin }