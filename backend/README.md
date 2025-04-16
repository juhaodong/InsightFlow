# InsightFlow 后端

本目录包含 InsightFlow 项目的后端代码。

## 技术栈

- 编程语言: [待定] (Python/Java/Node.js)
- Web框架: [待定]
- 数据库: [待定] (SQL/NoSQL)
- ORM/数据访问: [待定]
- 认证与授权: [待定]

## 目录结构

```
backend/
├── src/                 # 源代码
│   ├── api/             # API路由和控制器
│   ├── config/          # 配置文件
│   ├── models/          # 数据模型
│   ├── services/        # 业务逻辑
│   ├── utils/           # 工具函数
│   └── middleware/      # 中间件
├── tests/               # 测试文件
├── scripts/             # 脚本和工具
└── README.md            # 说明文档
```

## 开发指南

### 环境设置

```
# 待定
```

### 安装依赖

```
# 待定
```

### 数据库设置

```
# 待定
```

### 运行开发服务器

```
# 待定
```

### 运行测试

```
# 待定
```

## API 端点

后端将提供以下主要API端点：

### 用户认证

- `POST /api/auth/register` - 用户注册
- `POST /api/auth/login` - 用户登录
- `POST /api/auth/logout` - 用户登出
- `GET /api/auth/profile` - 获取用户信息

### 文件管理

- `POST /api/files/upload` - 上传文件
- `GET /api/files` - 获取文件列表
- `GET /api/files/:id` - 获取文件详情
- `DELETE /api/files/:id` - 删除文件

### 流程分析

- `POST /api/process/analyze` - 分析文件并提取流程
- `GET /api/process` - 获取流程列表
- `GET /api/process/:id` - 获取流程详情
- `PUT /api/process/:id` - 更新流程信息

### 自然语言查询

- `POST /api/query` - 提交自然语言查询
- `GET /api/query/history` - 获取查询历史

## 与AI模块集成

后端将与 `src/ai` 目录中的AI模块集成，用于：

- 文档内容提取和结构化
- 文件分类和标签化
- 流程识别和构建
- 自然语言查询处理

## 数据库模型

主要数据模型将包括：

- User - 用户信息
- File - 文件元数据和处理状态
- Process - 流程定义和关系
- ProcessNode - 流程节点信息
- Query - 查询历史和结果

详细的数据模型设计将在开发过程中完善。